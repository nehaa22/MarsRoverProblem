package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Exception.RoverAlreadyDeadException;
import com.thoughtworks.bootcamp.Exception.RoverDeadException;

public class Rover {

    private Direction direction;
    private Coordinate coordinate;
    private Plateau plateau;
    private boolean isDead = false;

    public Rover(Direction direction, Coordinate coordinate, Plateau plateau) {
        this.direction = direction;
        this.coordinate = coordinate;
        this.plateau = plateau;
    }

    public Direction turnLeft() throws RoverAlreadyDeadException {
        if (isDead) {
            throw new RoverAlreadyDeadException();
        }
        this.direction = direction.left();
        return this.direction;
    }

    public Direction turnRight() throws RoverAlreadyDeadException {
        if (isDead) {
            throw new RoverAlreadyDeadException();
        }
        this.direction = direction.right();
        return this.direction;
    }

    public Coordinate move() throws RoverDeadException {
        Coordinate newCoordinate = coordinate.move(direction);

        if (plateau.isWithinBound(newCoordinate))
            return this.coordinate = newCoordinate;
        else
            isDead = true;
        throw new RoverDeadException();
    }
}
