package com.thoughtworks.bootcamp;

public class Rover {

    private Direction direction;

    public Rover(Direction direction, Coordinate coordinate) {
        this.direction = direction;
    }

    public Direction turnLeft() {
        return direction.left();
    }

    public Direction turnRight() {
        return direction.right();
    }

    public Coordinate move() {
        return direction.move();
    }
}
