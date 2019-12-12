package co.uk.simulator.robot.toy;

import static java.lang.Runtime.getRuntime;
import static java.lang.String.format;

import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;

import co.uk.simulator.robot.toy.command.Command;
import co.uk.simulator.robot.toy.model.Board;
import co.uk.simulator.robot.toy.model.Robot;


public class ToyRobotApplication {

    private static volatile boolean EXIT;
    private static final int ROWS = 5;
    private static final int COLUMNS = 5;

    public static void main(String[] args) {

        System.out.println("Toy Robot Application");
        System.out.println("Press Ctrl+C to exit...\n");

        try {
            final Board board = new Board(ROWS, COLUMNS);
            Optional<Robot> robot = Optional.empty();

            try (Scanner scanner = new Scanner(System.in)) {
                while (!EXIT) {
                    System.out.print("Command: ");
                    final String line = scanner.nextLine();
                    final Optional<Robot> maybeRobot = Command.of(line)
                            .map(inspectRobotPlaced(robot))
                            .map(execute(board, robot.orElse(null)));

                    robot = maybeRobot.isPresent() ? maybeRobot : robot;
                }
            }
        } catch (Exception e) {
            System.out.println(format("An error occurred: %s", e.getMessage()));
        }

        getRuntime().addShutdownHook(new Thread(() -> EXIT = true));
    }


    private static Function<Command, Command> inspectRobotPlaced(Optional<Robot> robot) {
        return command -> !robot.isPresent() && command.requiresRobot() ? null : command;
    }

    private static Function<Command, Robot> execute(Board board, Robot robot) {
        return command -> command.execute(board, robot);
    }
}
