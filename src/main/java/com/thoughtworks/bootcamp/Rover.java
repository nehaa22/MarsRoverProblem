package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Exception.RoverDeadException;

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

    public Coordinate move() throws RoverDeadException {
        Coordinate newCoordinate = coordinate.move(direction);

        Coordinate upperCoordinate = new Coordinate(5, 5);
        Coordinate lowerCoordinate = new Coordinate(0, 0);
        if (newCoordinate.isBetween(lowerCoordinate, upperCoordinate))
            return this.coordinate = newCoordinate;
        else
            throw new RoverDeadException();
    }
}
