package org.pop.Ent;

import org.springframework.stereotype.Component;

public class Voluteer implements Thinker {

    String think;

    @Override
    public void thinkOfSomething(String think) {
        this.think = think;
    }

    public String getThink() {
        return think;
    }

}
