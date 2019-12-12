package co.uk.simulator.robot.toy.command;


import static co.uk.simulator.robot.toy.model.RotationDirection.RIGHT;

import co.uk.simulator.robot.toy.model.Board;
import co.uk.simulator.robot.toy.model.Robot;

public class RightCommand implements Command {

    @Override
    public Robot execute(Board board, Robot robot) {
        return robot.rotate(RIGHT);
    }
}
