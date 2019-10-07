package com.thoughtworks.bootcamp;

public class Coordinate {
    private double xCoordinate;
    private double yCoordinate;

    public Coordinate(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object coordinate) {
        if (this == coordinate) return true;
        Coordinate that = (Coordinate) coordinate;
        return Double.compare(that.xCoordinate, xCoordinate) == 0 &&
                Double.compare(that.yCoordinate, yCoordinate) == 0;
    }

    Coordinate move(Direction direction){
        return new Coordinate((xCoordinate + direction.move().xCoordinate ),(yCoordinate + direction.move().yCoordinate));
    }
}
