package com.rafaeldroid.WealthWise.controllers;

import com.rafaeldroid.WealthWise.models.Transaction;
import com.rafaeldroid.WealthWise.services.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/wealthwise")
@RequiredArgsConstructor
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Transaction> getAllTransactions(){
        return transactionService.getTransactions();
    }
    @GetMapping("/{idTransaction")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Transaction> getTransactionById(@PathVariable Long id){
        return transactionService.getTransactionById(id);
    }
}
