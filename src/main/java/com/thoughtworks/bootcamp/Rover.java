package com.thoughtworks.bootcamp;

public class Rover {
    private Direction direction;
    private Coordinate coordinate;

    public Rover(Direction direction, Coordinate coordinate) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    public String move() {
        return "L";
    }
}
