
package com.example.strategy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private final PaymentService paymentService;

    public AppRunner(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void run(String... args) {
        paymentService.pay("creditCard", 150);
        paymentService.pay("paypal", 300);
    }
}
