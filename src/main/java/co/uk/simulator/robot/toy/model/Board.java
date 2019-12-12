package co.uk.simulator.robot.toy.model;

public class Board {

    private int rows = 5;
    private int columns = 5;

    public Board(final int rows, final int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public boolean containsPoint(Point location) {
        return location.getX() >= 0 && location.getX() < columns &&
                location.getY() >= 0 && location.getY() < rows;
    }
}
