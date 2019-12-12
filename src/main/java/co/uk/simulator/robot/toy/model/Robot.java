package co.uk.simulator.robot.toy.model;

import static java.lang.String.format;

public class Robot {

    private final Direction facing;

    private final Point location;

    public Robot(final Direction facing, final Point location) {
        this.facing = facing;
        this.location = location;
    }

    public Direction getFacing() {
        return facing;
    }

    public Point getLocation() {
        return location;
    }

    public Robot rotate(final RotationDirection rotation) {
        final int rotatedDegree = facing.getDegree() + rotation.getAngle();
        final Direction direction = Direction.of(rotatedDegree, rotation.getAngle());
        return new Robot(direction, location);
    }

    @Override
    public String toString() {
        return format("%s,%s", location, facing);
    }

}
