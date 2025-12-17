package MyHomeTheater;

import MyHomeTheater.Components.Amplifier;
import MyHomeTheater.Components.PopcornPopper;
import MyHomeTheater.Components.Projector;
import MyHomeTheater.Components.Screen;
import MyHomeTheater.Components.StreamingPlayer;
import MyHomeTheater.Components.TheaterLights;
import MyHomeTheater.Components.Tuner;
import MyHomeTheater.Facade.HomeTheaterFacade;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        StreamingPlayer player = new StreamingPlayer("Top-O-Line Streaming Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, player, projector, lights, screen, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
