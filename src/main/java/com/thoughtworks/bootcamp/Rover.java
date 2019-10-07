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
        if (direction == Direction.N) {
            return (new Coordinate(coordinate.xCoordinate + 0, coordinate.yCoordinate + 1));
        } else if (direction == Direction.S) {
            return (new Coordinate(coordinate.xCoordinate + 0, coordinate.yCoordinate - 1));
        } else if (direction == Direction.E) {
            return (new Coordinate(coordinate.xCoordinate + 1, coordinate.yCoordinate + 0));
        } else {
            return (new Coordinate(coordinate.xCoordinate - 1, coordinate.yCoordinate + 0));
        }
    }
}
