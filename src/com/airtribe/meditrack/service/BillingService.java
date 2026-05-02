package com.airtribe.meditrack.service;

import com.airtribe.meditrack.entity.BillSummary;

public class BillingService {

    public BillSummary generateBill(double amount) {
        double tax = 0.18;
        return new BillSummary(amount, tax);
    }
}