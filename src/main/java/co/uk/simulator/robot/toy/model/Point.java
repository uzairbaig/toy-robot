package co.uk.simulator.robot.toy.model;

import java.util.function.BiFunction;


public final class Point {

    private final int x;

    private final int y;

    public Point(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public Point update(BiFunction<Integer, Integer, Point> action) {
        return action.apply(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + "," + y;
    }
}
