package com.rafaeldroid.WealthWise.models;

import com.rafaeldroid.WealthWise.models.enums.KindTransaction;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;
    private String date;
    @Enumerated(EnumType.STRING)
    private KindTransaction kindTransaction;

}
