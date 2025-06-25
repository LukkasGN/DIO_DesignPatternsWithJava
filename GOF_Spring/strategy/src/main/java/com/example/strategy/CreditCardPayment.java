
package com.example.strategy;

import org.springframework.stereotype.Component;

@Component("creditCard")
public class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " with Credit Card (Spring).");
    }
}
