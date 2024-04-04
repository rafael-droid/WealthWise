package com.rafaeldroid.WealthWise.repositories;

import com.rafaeldroid.WealthWise.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
