
public class HomeTheaterFacade {
    private DVDPlayer dvd = new DVDPlayer();
    private Projector projector = new Projector();
    private SoundSystem sound = new SoundSystem();

    void watchMovie() {
        projector.on();
        sound.on();
        dvd.on();
        dvd.play();
    }
}
