package com.airtribe.meditrack.service;

import com.airtribe.meditrack.interfaces.BillingStrategy;

public class BillingFactory {

    public static BillingStrategy getStrategy(String type) {

        if (type.equalsIgnoreCase("discount")) {
            return new DiscountBilling();
        }

        return new NormalBilling();
    }
}