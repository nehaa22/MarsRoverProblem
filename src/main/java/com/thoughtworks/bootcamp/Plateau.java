package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Exception.RoverDeadException;

public class Plateau {
    private Coordinate upperCoordinate;

    public Plateau(Coordinate upperCoordinate) {
        this.upperCoordinate = upperCoordinate;
    }

    public boolean isWithinBound(Coordinate roverCoordinate) throws RoverDeadException {
        return (roverCoordinate.isBetween(upperCoordinate));
    }
}
