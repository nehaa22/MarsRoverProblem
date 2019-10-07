package com.thoughtworks.bootcamp;

import java.util.Objects;

public class Coordinate {
    double xCoordinate;
    double yCoordinate;

    public Coordinate(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object coordinate) {
        if (this == coordinate) return true;
        if (coordinate == null || getClass() != coordinate.getClass()) return false;
        Coordinate that = (Coordinate) coordinate;
        return Double.compare(that.xCoordinate, xCoordinate) == 0 &&
                Double.compare(that.yCoordinate, yCoordinate) == 0;
    }


}
