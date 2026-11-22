package com.uet.payment;

public class PaymentMain {

    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        System.out.println("===== PAYMENT 1 =====");
        processor.charge("TX1001", 5000.00);

        System.out.println();

        System.out.println("===== PAYMENT 2 =====");
        processor.charge("TX2002", 2500.00);

    }
}