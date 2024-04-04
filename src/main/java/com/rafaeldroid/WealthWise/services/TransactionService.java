package com.rafaeldroid.WealthWise.services;

import com.rafaeldroid.WealthWise.models.Transaction;
import com.rafaeldroid.WealthWise.repositories.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
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
}
