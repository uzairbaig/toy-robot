package co.uk.simulator.robot.toy.command;

import static java.lang.String.format;

import co.uk.simulator.robot.toy.model.Board;
import co.uk.simulator.robot.toy.model.Robot;

public class ReportCommand implements Command {

    @Override
    public Robot execute(Board board, Robot robot) {
        System.out.println(format("Output:%s",robot));
        return robot;
    }
}
