package com.airtribe.meditrack.entity;

public final class BillSummary {

    private final double amount;
    private final double tax;
    private final double finalAmount;

    public BillSummary(double amount, double tax) {
        this.amount = amount;
        this.tax = tax;
        this.finalAmount = amount + (amount * tax);
    }

    public double getFinalAmount() {
        return finalAmount;
    }

    @Override
    public String toString() {
        return "Final Bill: " + finalAmount;
    }
}