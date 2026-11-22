package com.uet.bank;

import java.math.BigDecimal;

public class BankMain {

    public static void main(String[] args) {

        System.out.println("Testing Bank Transfer Validation...");

        // Attempt 1: Negative amount
        BankTransfer transfer = new BankTransfer(
                "ACC-1001",
                "ACC-2002",
                new BigDecimal("-500")
        );

        System.out.println("Transfer created successfully!");

    }
}
