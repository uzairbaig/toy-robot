package co.uk.simulator.robot.toy.model;

import static java.lang.Math.abs;
import static java.lang.Math.round;
import static java.util.Arrays.stream;

import java.util.function.Predicate;

import co.uk.simulator.robot.toy.ToyRobotException;

public enum Direction {
    NORTH(360),
    EAST(90),
    SOUTH(180),
    WEST(270);

    private final int degree;

    Direction(final int degree) {
        this.degree = degree;
    }

    public int getDegree() {
       return this.degree;
    }

    public static Direction of(final int degree, final int angle) {
        final Direction[] directions = values();
        final int index = (int) round((((double) degree % 360) / abs(angle))) % directions.length;
        return directions[index];
    }

    public static Direction get(final String word) {
        final Predicate<Direction> matchNameOrLetter = direction ->
                direction.name().equalsIgnoreCase(word);

        return stream(values())
                .filter(matchNameOrLetter)
                .findFirst()
                .orElseThrow(() -> new ToyRobotException("Invalid direction"));
    }
}
