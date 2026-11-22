
package com.uet.payment;

public class PaymentProcessor {

    public void charge(String txId, double amount) {

        try {

            System.out.println(
                "[TraceID: " + txId + "] Processing payment..."
            );

            System.out.println(
                "[TraceID: " + txId + "] Amount: " + amount
            );

            // Simulating payment processing
            System.out.println(
                "[TraceID: " + txId + "] Payment successful."
            );

        } finally {

            System.out.println(
                "[TraceID: " + txId + "] Context Cleared."
            );

        }
    }
}
