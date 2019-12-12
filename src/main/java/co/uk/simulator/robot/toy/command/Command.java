package co.uk.simulator.robot.toy.command;

import static java.util.Arrays.stream;
import static java.util.regex.Pattern.compile;

import java.util.Optional;

import co.uk.simulator.robot.toy.model.Board;
import co.uk.simulator.robot.toy.model.Robot;

public interface Command {

    Robot execute(final Board board, final Robot robot);

    default boolean requiresRobot() {
        return true;
    }

    static Optional<Command> of(final String line) {
        return stream(CommandPattern.values())
                .filter(command -> compile(command.getRegex())
                        .matcher(line)
                        .matches())
                .findFirst()
                .map(command -> command.getCreate().apply(line));
    }
}
