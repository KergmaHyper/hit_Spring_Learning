package org.pop.Ent;

public class PoeticJuggler extends Juggler {
    private Poem poem;

    PoeticJuggler() {
    }

    PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While recite...");
        poem.recite();

    }
}
