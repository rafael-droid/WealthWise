package com.rafaeldroid.WealthWise.services;

import org.springframework.stereotype.Service;

@Service
public class RateService {
    private final String apiGold = "https://api.nbp.pl/api/cenyzlota/?format=json";
    private final String apiCurrency = "https://api.nbp.pl/api/exchangerates/rates/c/";

    public String getValue(String currency) {
        return "null";
    }
}
