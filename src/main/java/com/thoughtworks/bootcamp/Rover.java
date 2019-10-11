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
        if(isDead){
            throw new RoverAlreadyDeadException();
        }
        else {

            Direction newDirection = direction.left();
            return this.direction = newDirection;
        }
    }

    public Direction turnRight() throws RoverAlreadyDeadException {
        if(isDead){
            throw new RoverAlreadyDeadException();
        }
        else{
            Direction newDirection = direction.right();
            return this.direction = newDirection;
        }
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
