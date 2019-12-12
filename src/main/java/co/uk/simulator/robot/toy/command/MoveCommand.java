package co.uk.simulator.robot.toy.command;

import co.uk.simulator.robot.toy.model.Board;
import co.uk.simulator.robot.toy.model.Direction;
import co.uk.simulator.robot.toy.model.Point;
import co.uk.simulator.robot.toy.model.Robot;

public class MoveCommand implements Command {

    @Override
    public Robot execute(final Board board, final Robot robot) {
        final Point current = robot.getLocation();
        final Point latest = move(current, robot.getFacing());
        return board.containsPoint(latest) ?
                new Robot(robot.getFacing(), latest) : robot;
    }

    private static Point move(final Point point, final Direction towards) {
        switch (towards) {
            case SOUTH:
                return point.update((x, y) -> new Point(x, --y));
            case WEST:
                return point.update((x, y) -> new Point(--x, y));
            case EAST:
                return point.update((x, y) -> new Point(++x, y));
            case NORTH:
                return point.update((x, y) -> new Point(x, ++y));
            default:
                return point;
        }
    }
}
