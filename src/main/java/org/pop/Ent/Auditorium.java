package org.pop.Ent;

public class Auditorium {
    enum lightState {
        On("On"), Off("Off");

        String state;

        lightState(String state) {
            this.state = state;
        }
    };

    lightState light;

    void lightOn() {
        light = lightState.On;
        printState();
    };

    void lightOff() {
        light = lightState.Off;
        printState();
    };

    void printState() {
        System.out.println("Light is :" + getState());
    }

    String getState() {
        return this.light.state;
    }
}
