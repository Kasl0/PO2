package Adapter;

import Adapter.Peg;
import Adapter.SquarePeg;

import static java.lang.Math.sqrt;

public class SquarePegAdapter implements Peg {

    private SquarePeg peg;

    SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    public int getRadius() {
        return (int) (peg.getWidth() * sqrt(2) / 2);
    }
}
