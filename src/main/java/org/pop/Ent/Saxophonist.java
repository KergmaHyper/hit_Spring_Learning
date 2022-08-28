package org.pop.Ent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Saxophonist extends Instrumentalist {

    Saxophonist() {
        super();
    }

    @Autowired
    @SaxInstrument
    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    // Instrument instrument;

}
