package com.thoughtworks.bootcamp;

public class Plateau {
    private Coordinate upperCoordinate;
    private Coordinate lowerCoordinate;

    public Plateau(){}

    public Plateau(Coordinate upperCoordinate, Coordinate lowerCoordinate) {
        this.upperCoordinate = upperCoordinate;
        this.lowerCoordinate = lowerCoordinate;
    }

    public boolean isWithinBound(Coordinate roverCoordinate) {
        return roverCoordinate.isBetween(lowerCoordinate, upperCoordinate);
    }

}
