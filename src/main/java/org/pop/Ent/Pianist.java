package org.pop.Ent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Pianist extends Instrumentalist {
    Pianist() {
        super();
    }

    @Autowired
    @Qualifier("fortepiano")
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    // @Autowired
    // @Qualifier("fortepiano")
    // Instrument piano;

    // public void perform() {
    // System.out.print("Pianist playing on fortepiano: " + song + ": ");
    // piano.play();
    // }

}
