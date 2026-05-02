package com.airtribe.meditrack.service;

import com.airtribe.meditrack.interfaces.BillingStrategy;

public class DiscountBilling implements BillingStrategy {

    @Override
    public double calculate(double amount) {
        return amount * 0.9;
    }
}