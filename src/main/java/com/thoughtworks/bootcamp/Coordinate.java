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
        if (!(coordinate instanceof Coordinate)) {
            return false;
        }
        Coordinate that = (Coordinate) coordinate;
        return (xCoordinate == that.xCoordinate && yCoordinate ==that.yCoordinate);
    }

    Coordinate add(Coordinate coordinate){
        return new Coordinate((xCoordinate + coordinate.xCoordinate ),(yCoordinate + coordinate.yCoordinate));
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }
}
