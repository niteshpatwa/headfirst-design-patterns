package MyHomeTheater.Facade;

import MyHomeTheater.Components.Amplifier;
import MyHomeTheater.Components.PopcornPopper;
import MyHomeTheater.Components.Projector;
import MyHomeTheater.Components.Screen;
import MyHomeTheater.Components.StreamingPlayer;
import MyHomeTheater.Components.TheaterLights;
import MyHomeTheater.Components.Tuner;

public class HomeTheaterFacade {
    private Amplifier amp;
    private StreamingPlayer player;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, StreamingPlayer player,
            Projector projector, TheaterLights lights,
            Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.player = player;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setStreamingPlayer(player);
        amp.setSurroundSound();
        amp.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        player.stop();
        player.off();
    }
}
