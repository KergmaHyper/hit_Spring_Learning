package org.pop.Ent;

public class Juggler implements Performer {
    int beanBags = 3;

    Juggler() {
    }

    Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    // @Override
    public void perform() throws PerformanceException {
        System.out.println("JUGGLER: " + beanBags + " beanBags.");
    }

}
