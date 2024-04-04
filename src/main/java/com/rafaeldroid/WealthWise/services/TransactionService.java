package com.rafaeldroid.WealthWise.services;

import com.rafaeldroid.WealthWise.models.Transaction;
import com.rafaeldroid.WealthWise.repositories.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService {
    @
    private TransactionRepository transactionRepository;
    public Iterable<Transaction> getTransactions() {
    }

    public Transaction getTransactionById(Long id) {
    }
}
