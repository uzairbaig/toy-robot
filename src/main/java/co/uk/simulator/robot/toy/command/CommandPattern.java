package co.uk.simulator.robot.toy.command;

import static java.lang.Integer.parseInt;

import java.util.function.Function;

import co.uk.simulator.robot.toy.model.Direction;

public enum CommandPattern {

    PLACE("(?i)PLACE (-?\\d+),(-?\\d+),(WEST|NORTH|SOUTH|EAST)$", s -> { return getPlaceCommand(s); }),
    MOVE("(?i)MOVE$", s -> new MoveCommand()),
    LEFT("(?i)LEFT$", s -> new LeftCommand()),
    RIGHT("(?i)RIGHT$", s -> new RightCommand()),
    REPORT("(?i)REPORT$", s -> new ReportCommand());

    CommandPattern(final String regex, final Function<String, Command> create) {
        this.regex = regex;
        this.create = create;
    }

    private final String regex;

    private final Function<String, Command> create;

    public String getRegex() {
        return regex;
    }

    public Function<String, Command> getCreate() {
        return create;
    }

    static Command getPlaceCommand(final String placeCommand) {
        final String[] command = placeCommand.split("[, ]");
        final int x = parseInt(command[1]);
        final int y = parseInt(command[2]);
        final Direction direction = Direction.get(command[3]);
        return new PlaceCommand(x, y, direction);
    }
}
