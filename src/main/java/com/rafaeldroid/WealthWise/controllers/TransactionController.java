package com.rafaeldroid.WealthWise.controllers;

import com.rafaeldroid.WealthWise.models.Transaction;
import com.rafaeldroid.WealthWise.repositories.TransactionRepository;
import com.rafaeldroid.WealthWise.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wealthwise")
@RequiredArgsConstructor
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public Iterable<Transaction> getAllTransactions(){
        return transactionService.getTransactions();
    }
    @GetMapping("/{idTransaction")
    public Transaction getTransactionById(@PathVariable Long id){
        return transactionService.getTransactionById(id);
    }
}
