package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class RoverTest {

    private Coordinate getCoordinate(int x, int y) {
        return new Coordinate(x, y);
    }

    @Nested
    class Left {

        @Test
        void givenFacingNorth_WhenTurnLeft_ThenShouldFaceWest() {
            Rover rover = new Rover(Direction.N, getCoordinate(0, 0));
            Assertions.assertEquals(Direction.W, rover.turnLeft());
        }

        @Test
        void givenFacingSouth_WhenTurnLeft_ThenShouldFaceEast() {
            Rover rover = new Rover(Direction.S, getCoordinate(0, 0));
            Assertions.assertEquals(Direction.E, rover.turnLeft());
        }

        @Test
        void givenFacingEast_WhenTurnLeft_ThenShouldFaceNorth() {
            Rover rover = new Rover(Direction.E, getCoordinate(0, 0));
            Assertions.assertEquals(Direction.N, rover.turnLeft());
        }

        @Test
        void givenFacingWest_WhenTurnLeft_ThenShouldFaceSouth() {
            Rover rover = new Rover(Direction.W, getCoordinate(0, 0));
            Assertions.assertEquals(Direction.S, rover.turnLeft());
        }

    }

    @Nested
    class Right {

        @Test
        void givenFacingNorth_WhenTurnRight_ThenShouldFaceEast() {
            Rover rover = new Rover(Direction.N, getCoordinate(0, 0));
            Assertions.assertEquals(Direction.E, rover.turnRight());
        }

        @Test
        void givenFacingEast_WhenTurnRight_ThenShouldFaceSouth() {
            Rover rover = new Rover(Direction.E, getCoordinate(0, 0));
            Assertions.assertEquals(Direction.S, rover.turnRight());
        }

        @Test
        void givenFacingSouth_WhenTurnRight_ThenShouldFaceWest() {
            Rover rover = new Rover(Direction.S, getCoordinate(0, 0));
            Assertions.assertEquals(Direction.W, rover.turnRight());
        }

        @Test
        void givenFacingWest_WhenTurnRight_ThenShouldFaceNorth() {
            Rover rover = new Rover(Direction.W, getCoordinate(0, 0));
            Assertions.assertEquals(Direction.N, rover.turnRight());
        }
    }

    @Nested
    class Move {

        @Test
        void givenFacingNorth_WhenMove_ThenShouldReturnNewCoordinate() {
            Rover rover = new Rover(Direction.N, getCoordinate(0, 0));
            Assertions.assertEquals(getCoordinate(0, 1), rover.move());

        }

        @Test
        void givenFacingSouth_WhenMove_ThenShouldreturnNewCoordinate() {
            Rover rover = new Rover(Direction.S, getCoordinate(0, 0));
            Assertions.assertEquals(getCoordinate(0, -1), rover.move());

        }

        @Test
        void givenFacingEast_WhenMove_ThenShouldreturnNewCoordinate() {
            Rover rover = new Rover(Direction.E, getCoordinate(0, 0));
            Assertions.assertEquals(getCoordinate(1, 0), rover.move());

        }

        @Test
        void givenFacingWest_WhenMove_ThenShouldreturnNewCoordinate() {
            Rover rover = new Rover(Direction.W, getCoordinate(0, 0));
            Assertions.assertEquals(getCoordinate(-1, 0), rover.move());

        }
    }
}