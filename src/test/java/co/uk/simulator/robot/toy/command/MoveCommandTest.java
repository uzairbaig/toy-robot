package co.uk.simulator.robot.toy.command;

import co.uk.simulator.robot.toy.model.Board;
import co.uk.simulator.robot.toy.model.Direction;
import co.uk.simulator.robot.toy.model.Point;
import co.uk.simulator.robot.toy.model.Robot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoveCommandTest {

    private MoveCommand moveCommand;
    private Board board;
    private Point point;
    private Robot robot;

    @Before
    public void setUp() {
        moveCommand = new MoveCommand();
        board = new Board(5,5);
    }

    @Test
    public void testMoveCommandPoint00() {
        point = new Point(0,0);
        robot = new Robot(Direction.NORTH, point);
        final Robot robot = moveCommand.execute(board, this.robot);
        final Point location = robot.getLocation();
        Assert.assertEquals(location.getX(), 0);
        Assert.assertEquals(location.getY(), 1);
        Assert.assertEquals(robot.getFacing(), Direction.NORTH);
    }

    @Test
    public void testMoveCommandPoint10() {
        point = new Point(1,0);
        robot = new Robot(Direction.NORTH, point);
        final Robot robot = moveCommand.execute(board, this.robot);
        final Point location = robot.getLocation();
        Assert.assertEquals(location.getX(), 1);
        Assert.assertEquals(location.getY(), 1);
        Assert.assertEquals(robot.getFacing(), Direction.NORTH);
    }

}
