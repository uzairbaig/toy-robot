package co.uk.simulator.robot.toy.model;

public enum RotationDirection {
    LEFT(-90),
    RIGHT(90);

    private final int angle;

    RotationDirection(final int angle) {
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }
}
