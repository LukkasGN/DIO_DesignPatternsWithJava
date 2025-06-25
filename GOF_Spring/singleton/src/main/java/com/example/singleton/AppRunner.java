
package com.example.singleton;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final Logger logger;

    public AppRunner(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void run(String... args) {
        logger.log("Hello from Spring Singleton Logger!");
    }
}
