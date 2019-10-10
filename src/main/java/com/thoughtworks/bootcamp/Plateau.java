package com.thoughtworks.bootcamp;

public class Plateau {
    private Coordinate upperCoordinate;

    public Plateau(Coordinate upperCoordinate) {
        this.upperCoordinate = upperCoordinate;
    }

    public boolean isWithinBound(Coordinate roverCoordinate) {
        return (roverCoordinate.isBetween(upperCoordinate));
    }
}
