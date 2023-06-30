package Adapter;

import Adapter.IncompatibleInterface;

public class SquarePeg implements IncompatibleInterface {

    private int width;

    SquarePeg(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

}
