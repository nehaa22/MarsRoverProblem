package com.thoughtworks.bootcamp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoverTest {

    @Test
    public void givenFacingNorth_WhenTurnLeft_ThenShouldFaceWest() {
        Rover rover = new Rover(Direction.N, new Coordinate(0, 0));
        Rover movedRover = rover.turnLeft();
        Assertions.assertEquals(Direction.W, movedRover.getDirection());
    }

    @Test
    public void givenFacingSouth_WhenTurnLeft_ThenShouldFaceEast() {
        Rover rover = new Rover(Direction.S, new Coordinate(0, 0));
        Rover movedRover = rover.turnLeft();
        Assertions.assertEquals(Direction.E, movedRover.getDirection());
    }

    @Test
    public void givenFacingNorth_WhenTurnRight_ThenShouldFaceEast() {
        Rover rover = new Rover(Direction.N, new Coordinate(0, 0));
        Rover movedRover = rover.turnRight();
        Assertions.assertEquals(Direction.E, movedRover.getDirection());
    }

    @Test
    public void givenFacingEast_WhenTurnRight_ThenShouldFaceSouth() {
        Rover rover = new Rover(Direction.E, new Coordinate(0, 0));
        Rover movedRover = rover.turnRight();
        Assertions.assertEquals(Direction.S, movedRover.getDirection());
    }

    @Test
    public void givenFacingSouth_WhenTurnRight_ThenShouldFaceWest() {
        Rover rover = new Rover(Direction.S, new Coordinate(0, 0));
        Rover movedRover = rover.turnRight();
        Assertions.assertEquals(Direction.W, movedRover.getDirection());
    }

    @Test
    public void givenFacingWest_WhenTurnRight_ThenShouldFaceNorth() {
        Rover rover = new Rover(Direction.W, new Coordinate(0, 0));
        Rover movedRover = rover.turnRight();
        Assertions.assertEquals(Direction.N, movedRover.getDirection());
    }

    @Test
    public void givenFacingEast_WhenTurnLeft_ThenShouldFaceNorth() {
        Rover rover = new Rover(Direction.E, new Coordinate(0, 0));
        Rover movedRover = rover.turnLeft();
        Assertions.assertEquals(Direction.N, movedRover.getDirection());
    }




}