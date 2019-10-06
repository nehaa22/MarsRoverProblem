package com.thoughtworks.bootcamp;

public class Coordinate {

    private double x;
    private double y;

    public Coordinate(double x, double y){
        x = this.x;
        y = this.y;
    }

    public boolean isAbove(Coordinate upperBound) {
        return ((this.y >= upperBound.x / 2) && (this.y <= upperBound.x ));
    }



}
