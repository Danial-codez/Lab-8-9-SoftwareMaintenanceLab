
package com.uet.bank;

import java.math.BigDecimal;
import java.util.Objects;

public record BankTransfer(
        String fromAccount,
        String toAccount,
        BigDecimal amount
) {

    public BankTransfer {

        Objects.requireNonNull(
                fromAccount,
                "Sender account cannot be null"
        );

        Objects.requireNonNull(
                toAccount,
                "Receiver account cannot be null"
        );

        Objects.requireNonNull(
                amount,
                "Transfer amount cannot be null"
        );

        if (amount.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                    "Transfer amount must be positive"
            );
        }
    }
}
