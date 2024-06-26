package com.rafaeldroid.WealthWise.services;

import com.rafaeldroid.WealthWise.models.Transaction;
import com.rafaeldroid.WealthWise.repositories.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;
    public Iterable<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }

    public Optional<Transaction> getTransactionById(Long id) {
        Optional<Transaction> transaction = transactionRepository.findById(id);

        if(transaction.isPresent())
            return transaction;
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found transaction");
    }

    public Transaction createTransaction(Transaction transaction) {
        validateNewTransaction(transaction);
        transactionRepository.save(transaction);
        return transaction;
    }

    private void validateNewTransaction(Transaction transaction) {
        if(ObjectUtils.isEmpty(transaction.getName()) && ObjectUtils.isEmpty(transaction.getAmount()))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);

    }

    public Transaction updateTransaction(Transaction transaction, Long id) {
        validateExistingTransaction(id);
        return transactionRepository.save(transaction);
    }

    private void validateExistingTransaction(Long id) {
        Optional<Transaction> existingTransaction = transactionRepository.findTransactionById(id);
        if(!existingTransaction.isPresent())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found transaction");

    }

    public String deleteTransaction(Long id) {
        validateExistingTransaction(id);
        try {
            transactionRepository.deleteById(id);
            return "Transaction was deleted";
        }catch (ResponseStatusException e){
            return e.getMessage();
        }
    }
}
