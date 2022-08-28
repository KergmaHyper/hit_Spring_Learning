package org.pop.Ent;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer {
    OneManBand() {
    }

    Properties propInstruments;
    // Map<String, Instrument> instruments;

    public void setPropInstruments(Properties propInstruments) {
        this.propInstruments = propInstruments;
    }

    // public void setInstruments(Map<String, Instrument> instruments) {
    // this.instruments = instruments;
    // }

    public void perform() throws PerformanceException {
        for (String str : propInstruments.stringPropertyNames()) {
            System.out.println(str + ": " + propInstruments.getProperty(str));
        }

        // for (String instrument : instruments.keySet()) {
        // System.out.print(instrument + ": ");
        // instruments.get(instrument).play();
        // }
    }

}
