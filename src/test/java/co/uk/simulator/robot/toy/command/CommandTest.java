package co.uk.simulator.robot.toy.command;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;

public class CommandTest {

    @Test
    public void testPlaceCommand() {
        final Optional<Command> command = Command.of("place 0,0,NORTH");
        Assert.assertTrue(command.isPresent());
        Assert.assertFalse(command.get().requiresRobot());
    }

    @Test
    public void testMoveCommand() {
        final Optional<Command> command = Command.of("move");
        Assert.assertTrue(command.isPresent());
        Assert.assertTrue(command.get().requiresRobot());
    }

    @Test
    public void testReportCommand() {
        final Optional<Command> command = Command.of("report");
        Assert.assertTrue(command.isPresent());
        Assert.assertTrue(command.get().requiresRobot());
    }

}
