package org.pop.Ent;

public class Knife {
    static int n = 0;
    int num;

    Knife() {
        n++;
        num = n;
        System.out.println("Created knife #" + num);
    }

    @Override
    public String toString() {
        return String.format("Knife #%d", num);
    }
}
