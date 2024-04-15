package com.rafaeldroid.WealthWise.controllers;

import com.rafaeldroid.WealthWise.services.RateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/rate")
@RequiredArgsConstructor
@RestController
public class RateController {
    private RateService rateService;


    @GetMapping("/{name}")
    public String getRate(@PathVariable String currency){
        return rateService.getValue(currency);
    }

}
