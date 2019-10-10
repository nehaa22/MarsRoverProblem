package com.thoughtworks.bootcamp;

public class Plateau {
    private Coordinate upperCoordinate;
    private Coordinate lowerCoordinate;


    public Plateau(Coordinate upperCoordinate) {
        this.upperCoordinate = upperCoordinate;
        this.lowerCoordinate = new Coordinate(0, 0);
    }

    public boolean isWithinBound(Coordinate roverCoordinate) {
        return roverCoordinate.isBetween(lowerCoordinate,upperCoordinate);
    }

}
