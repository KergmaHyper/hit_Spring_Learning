package org.pop.Ent;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("fortepiano")
public class Piano implements Instrument {

    public void play() {
        System.out.println("Plink Plink Plink");
    }
}
