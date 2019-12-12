package co.uk.simulator.robot.toy.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoardTest {

    Board board;

    @Before
    public void setup() {
        board = new Board(5,5);
    }

    @Test
    public void containsPointShouldReturnTrue() {
       final Point point = new Point(1,0);
       Assert.assertTrue(board.containsPoint(point));
    }

    @Test
    public void containsPointShouldReturnFalse() {
        final Point point = new Point(0,6);
        Assert.assertFalse(board.containsPoint(point));
    }

}
