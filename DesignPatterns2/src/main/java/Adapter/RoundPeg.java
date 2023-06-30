package Adapter;

import Adapter.Peg;

public class RoundPeg implements Peg {
    private int radius;

    RoundPeg(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
