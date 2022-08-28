package org.pop.Ent;

public class Stage {
    private Stage() {
    }

    private static class StageHolder {
        static Stage instance = new Stage();
    }

    public static Stage getInstance() {
        return StageHolder.instance;
    }
}