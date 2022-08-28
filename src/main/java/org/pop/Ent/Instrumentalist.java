package org.pop.Ent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Instrumentalist implements Performer {

    Instrumentalist() {
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void screamSong(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    // @Autowired
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    String song;

    Instrument instrument;

    // @Override
    public void perform() throws PerformanceException {
        System.out.print("Instrumentalist playing: " + song + ": ");
        instrument.play();
    }
}
