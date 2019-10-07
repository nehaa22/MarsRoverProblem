package com.thoughtworks.bootcamp;

public class Rover {

    private Direction direction;

    public Rover(Direction direction, Coordinate coordinate) {
        this.direction = direction;
    }

    public Rover turnLeft() {
        if (direction == Direction.S) {
            direction = Direction.E;
        } else if(direction ==Direction.E){
            direction = Direction.N;
        }else if(direction == Direction.W){
            direction = Direction.S;
        }else {
            direction = Direction.W;
        }
        return this;
    }

    public Direction getDirection() {
        return direction;
    }

    public Rover turnRight() {
        if(direction == Direction.E){
            direction = Direction.S;
        }else if(direction == Direction.S){
            direction = Direction.W;
        }else if(direction == Direction.W){
            direction = Direction.N;
        }else {
            direction = Direction.E;
        }
        return this;
    }
}
