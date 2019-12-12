package co.uk.simulator.robot.toy.command;


import static co.uk.simulator.robot.toy.model.RotationDirection.LEFT;

import co.uk.simulator.robot.toy.model.Board;
import co.uk.simulator.robot.toy.model.Robot;

public class LeftCommand implements Command {

    @Override
    public Robot execute(final Board board, final Robot robot) {
        return robot.rotate(LEFT);
    }
}
