
package com.example.strategy;

import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class PaymentService {
    private final Map<String, PaymentStrategy> strategies;

    public PaymentService(Map<String, PaymentStrategy> strategies) {
        this.strategies = strategies;
    }

    public void pay(String method, int amount) {
        strategies.get(method).pay(amount);
    }
}
