package com.thoughtworks.bootcamp;

public class Rover {

    private Direction direction;

    public Rover(Direction direction, Coordinate coordinate) {
        this.direction = direction;
    }

    public Rover turnLeft() {
        if (direction == Direction.S) {
            direction = Direction.E;
        } else {
            direction = Direction.W;
        }
        return this;
    }

    public Direction getDirection() {
        return direction;
    }

    public Rover turnRight() {
        direction = Direction.E;
        return this;
    }
}
