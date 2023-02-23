package it.unibo.game;

public class Model {
    private int value;

    public Model() {
        value = 0;
    }

    public void incrementValue() {
        value++;
    }

    public void decrementValue() {
        value--;
    }

    public int getValue() {
        return value;
    }
}
