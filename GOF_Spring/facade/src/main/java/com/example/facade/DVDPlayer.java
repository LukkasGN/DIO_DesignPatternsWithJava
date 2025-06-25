
package com.example.facade;

import org.springframework.stereotype.Component;

@Component
public class DVDPlayer {
    void on() { System.out.println("DVD Player on"); }
    void play() { System.out.println("Playing movie"); }
}
