package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoverTest {

    @Test
    void givenFacingNorth_WhenTurnLeft_ThenShouldFaceWest() {
        Rover rover = new Rover(Direction.N, new Coordinate(0, 0));
        Assertions.assertEquals(Direction.W, rover.turnLeft());
    }

    @Test
    void givenFacingSouth_WhenTurnLeft_ThenShouldFaceEast() {
        Rover rover = new Rover(Direction.S, new Coordinate(0, 0));
        Assertions.assertEquals(Direction.E, rover.turnLeft());
    }

    @Test
    void givenFacingEast_WhenTurnLeft_ThenShouldFaceNorth() {
        Rover rover = new Rover(Direction.E, new Coordinate(0, 0));
        Assertions.assertEquals(Direction.N, rover.turnLeft());
    }

    @Test
    void givenFacingWest_WhenTurnLeft_ThenShouldFaceSouth() {
        Rover rover = new Rover(Direction.W, new Coordinate(0, 0));
        Assertions.assertEquals(Direction.S, rover.turnLeft());
    }

    @Test
    void givenFacingNorth_WhenTurnRight_ThenShouldFaceEast() {
        Rover rover = new Rover(Direction.N, new Coordinate(0, 0));
        Assertions.assertEquals(Direction.E, rover.turnRight());
    }

    @Test
    void givenFacingEast_WhenTurnRight_ThenShouldFaceSouth() {
        Rover rover = new Rover(Direction.E, new Coordinate(0, 0));
        Assertions.assertEquals(Direction.S, rover.turnRight());
    }

    @Test
    void givenFacingSouth_WhenTurnRight_ThenShouldFaceWest() {
        Rover rover = new Rover(Direction.S, new Coordinate(0, 0));
        Assertions.assertEquals(Direction.W, rover.turnRight());
    }

    @Test
    void givenFacingWest_WhenTurnRight_ThenShouldFaceNorth() {
        Rover rover = new Rover(Direction.W, new Coordinate(0, 0));
        Assertions.assertEquals(Direction.N, rover.turnRight());
    }

}