package org.pop.Ent;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

public class Magician implements MindReader {
    private String tning;

    public void readThing(String thing) {
        System.out.println("Intercepting thin in volunteer");
        this.tning = thing;
    }

    public String getThing() {
        return tning;
    }

}
