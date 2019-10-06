package com.thoughtworks.bootcamp;

public class Rover {
    private Direction direction;
    private Coordinate coordinate;

    public Rover(Direction direction, Coordinate coordinate) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    public Rover move() {
        return this;
    }

    public Rover turnLeft() {
        return this;
    }

    public Direction getDirection() {
        return Direction.W;
    }
}
