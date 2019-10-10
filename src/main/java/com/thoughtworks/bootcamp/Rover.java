package com.thoughtworks.bootcamp;

public class Rover {

    private Direction direction;
    private Coordinate coordinate;

    public Rover(Direction direction, Coordinate coordinate) {
        this.direction = direction;
        this.coordinate = coordinate;
    }

    public Direction turnLeft() {
       Direction newDirection = direction.left();
        return this.direction = newDirection;
    }

    public Direction turnRight() {
        Direction newDirection = direction.right();
        return this.direction = newDirection;
    }

    public Coordinate move() {
        Coordinate newCoordinate = coordinate.move(direction);
        return this.coordinate = newCoordinate;
    }
}
