package co.uk.simulator.robot.toy.model;

import org.junit.Assert;
import org.junit.Test;

public class RobotTest {

    private Robot robot;

    @Test
    public void shouldRotateRobotToLeft() {
        robot = new Robot(Direction.NORTH, new Point(0,0));
        final Robot newRobot = robot.rotate(RotationDirection.LEFT);
        Assert.assertEquals(newRobot.getFacing(), Direction.WEST);
        Assert.assertEquals(newRobot.getLocation().getX(), 0);
        Assert.assertEquals(newRobot.getLocation().getY(), 0);
    }

    @Test
    public void shouldRotateRobotToRight() {
        robot = new Robot(Direction.NORTH, new Point(0,0));
        final Robot newRobot = robot.rotate(RotationDirection.RIGHT);
        Assert.assertEquals(newRobot.getFacing(), Direction.EAST);
        Assert.assertEquals(newRobot.getLocation().getX(), 0);
        Assert.assertEquals(newRobot.getLocation().getY(), 0);
    }

}
