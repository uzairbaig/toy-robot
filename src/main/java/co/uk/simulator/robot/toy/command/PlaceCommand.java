package co.uk.simulator.robot.toy.command;


import co.uk.simulator.robot.toy.model.Board;
import co.uk.simulator.robot.toy.model.Direction;
import co.uk.simulator.robot.toy.model.Point;
import co.uk.simulator.robot.toy.model.Robot;

public class PlaceCommand implements Command {

    private final int x;
    private final int y;
    private final Direction direction;

    public PlaceCommand(final int x, final int y, final Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public Robot execute(final Board board, final Robot robot) {
        final Point point = new Point(x, y);
        return board.containsPoint(point) ? new Robot(direction, point) : robot;
    }

    @Override
    public boolean requiresRobot() {
        return false;
    }
}
