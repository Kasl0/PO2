package Adapter;

public class RoundHole {

    private int radius;

    RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(Peg peg) {
        return peg.getRadius() <= getRadius();
    }
}
