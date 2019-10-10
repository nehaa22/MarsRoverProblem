package com.thoughtworks.bootcamp;

public class Rover {

    private Direction direction;
    private Coordinate coordinate;

    public Rover(Direction direction, Coordinate coordinate) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    public Direction turnLeft() {
        return direction.left();
    }

    public Direction turnRight() {
        return direction.right();
    }

    public Coordinate move() {
        Coordinate newCoordinate = coordinate.move(direction);
        this.coordinate = newCoordinate;
        return newCoordinate;
    }
}
