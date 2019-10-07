package com.thoughtworks.bootcamp;

import java.util.Objects;

public class Coordinate {

    public double xCoordinate;
    public double yCoordinate;

    public Coordinate(double xCoordinate, double yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return Double.compare(that.xCoordinate, xCoordinate) == 0 &&
                Double.compare(that.yCoordinate, yCoordinate) == 0;
    }


}
