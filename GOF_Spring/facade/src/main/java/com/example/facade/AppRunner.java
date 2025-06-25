
package com.example.facade;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {
    private final HomeTheaterFacade homeTheater;

    public AppRunner(HomeTheaterFacade homeTheater) {
        this.homeTheater = homeTheater;
    }

    @Override
    public void run(String... args) {
        homeTheater.watchMovie();
    }
}
