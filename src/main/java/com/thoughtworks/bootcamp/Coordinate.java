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
        return (xCoordinate == that.xCoordinate && yCoordinate == that.yCoordinate);
    }

    Coordinate move(Direction direction) {
        return new Coordinate((xCoordinate + direction.move().xCoordinate), (yCoordinate + direction.move().yCoordinate));
    }

    public boolean isBetween(Coordinate upperCoordinate) {
        return ((xCoordinate >= 0 && xCoordinate <= upperCoordinate.xCoordinate)
                && yCoordinate >= 0 && yCoordinate <= upperCoordinate.yCoordinate);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                '}';
    }

}
