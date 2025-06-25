
package com.example.facade;

import org.springframework.stereotype.Component;

@Component
public class HomeTheaterFacade {
    private final DVDPlayer dvd;
    private final Projector projector;
    private final SoundSystem sound;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
    }

    public void watchMovie() {
        projector.on();
        sound.on();
        dvd.on();
        dvd.play();
    }
}
