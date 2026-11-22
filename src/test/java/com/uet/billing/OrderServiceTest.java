package com.uet.billing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderServiceTest {

    @Test
    void calculateTotal_appliesVipDiscount_withoutTouchingDatabase() {

        // ARRANGE
        DiscountPolicy vipDiscount = new VipDiscount();
        OrderService orderService = new OrderService(vipDiscount);

        double originalAmount = 1000.00;
        double expectedTotal = 800.00;

        // ACT
        double actualTotal = orderService.calculateTotal(originalAmount);

        // ASSERT
        assertEquals(expectedTotal, actualTotal, 0.001);
    }
}