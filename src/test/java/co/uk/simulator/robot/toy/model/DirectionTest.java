package co.uk.simulator.robot.toy.model;

import org.junit.Assert;
import org.junit.Test;

public class DirectionTest {

    @Test
    public void shouldHaveNorthDirection() {
        final Direction direction = Direction.of(360, 0);
        Assert.assertEquals(direction, Direction.NORTH);
    }

    @Test
    public void shouldHaveSouthDirection() {
        final Direction direction = Direction.of(180, 2);
        Assert.assertEquals(direction, Direction.SOUTH);
    }

    @Test
    public void shouldHaveEastDirection() {
        final Direction direction = Direction.of(90, 2);
        Assert.assertEquals(direction, Direction.EAST);
    }

    @Test
    public void shouldHaveWestDirection() {
        final Direction direction = Direction.of(270, 2);
        Assert.assertEquals(direction, Direction.WEST);
    }
}
