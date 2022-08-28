package org.pop.Ent;

import org.springframework.web.cors.reactive.PreFlightRequestHandler;

public class Vocalist implements Performer {
    Vocalist() {
    }

    String song;

    public void setSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    public void perform() {
        System.out.println("Song: " + song);
    }
}
