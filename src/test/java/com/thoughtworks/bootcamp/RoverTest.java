package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class RoverTest {

    private Coordinate origin() {
        return new Coordinate(0, 0);
    }

    @Nested
    class Left {

        @Test
        void givenFacingNorth_WhenTurnLeft_ThenShouldFaceWest() {
            Rover rover = new Rover(Direction.N, origin());
            Assertions.assertEquals(Direction.W, rover.turnLeft());
        }

        @Test
        void givenFacingSouth_WhenTurnLeft_ThenShouldFaceEast() {
            Rover rover = new Rover(Direction.S, origin());
            Assertions.assertEquals(Direction.E, rover.turnLeft());
        }

        @Test
        void givenFacingEast_WhenTurnLeft_ThenShouldFaceNorth() {
            Rover rover = new Rover(Direction.E, origin());
            Assertions.assertEquals(Direction.N, rover.turnLeft());
        }

        @Test
        void givenFacingWest_WhenTurnLeft_ThenShouldFaceSouth() {
            Rover rover = new Rover(Direction.W, origin());
            Assertions.assertEquals(Direction.S, rover.turnLeft());
        }

    }

    @Nested
    class Right {

        @Test
        void givenFacingNorth_WhenTurnRight_ThenShouldFaceEast() {
            Rover rover = new Rover(Direction.N, origin());
            Assertions.assertEquals(Direction.E, rover.turnRight());
        }

        @Test
        void givenFacingEast_WhenTurnRight_ThenShouldFaceSouth() {
            Rover rover = new Rover(Direction.E, origin());
            Assertions.assertEquals(Direction.S, rover.turnRight());
        }

        @Test
        void givenFacingSouth_WhenTurnRight_ThenShouldFaceWest() {
            Rover rover = new Rover(Direction.S, origin());
            Assertions.assertEquals(Direction.W, rover.turnRight());
        }

        @Test
        void givenFacingWest_WhenTurnRight_ThenShouldFaceNorth() {
            Rover rover = new Rover(Direction.W, origin());
            Assertions.assertEquals(Direction.N, rover.turnRight());
        }
    }

    @Nested
    class MoveFromOrigin {

        @Test
        void givenFacingSouth_WhenMove_ThenShouldReturnNewCoordinate() {
            Rover rover = new Rover(Direction.S, origin());
            Assertions.assertEquals(new Coordinate(0, -1), rover.move());

        }

        @Test
        void givenFacingEast_WhenMove_ThenShouldReturnNewCoordinate() {
            Rover rover = new Rover(Direction.E, origin());
            Assertions.assertEquals(new Coordinate(1, 0), rover.move());

        }

        @Test
        void givenFacingWest_WhenMove_ThenShouldReturnNewCoordinate() {
            Rover rover = new Rover(Direction.W, origin());
            Assertions.assertEquals(new Coordinate(-1, 0), rover.move());

        }

        @Test
        void givenFacingNorth_WhenMove_ThenShouldReturnNewCoordinate() {
            Rover rover = new Rover(Direction.N, origin());
            Assertions.assertEquals(new Coordinate(0, 1), rover.move());

        }
    }

    @Nested
    class MoveFromAnyCoordinate {
        @Test
        void givenFacingWestOnNewPosition_WhenMove_ThenShouldReturnNewCoordinate() {
            Rover rover = new Rover(Direction.W, new Coordinate(2, 2));
            Assertions.assertEquals(new Coordinate(1, 2), rover.move());

        }

        @Test
        void givenFacingNorthOnNewPosition_WhenMove_ThenShouldReturnNewCoordinate() {
            Rover rover = new Rover(Direction.N, new Coordinate(3, 2));
            Assertions.assertEquals(new Coordinate(3, 3), rover.move());

        }

        @Test
        void givenFacingEastOnNewPosition_WhenMove_ThenShouldReturnNewCoordinate() {
            Rover rover = new Rover(Direction.E, new Coordinate(1, -2));
            Assertions.assertEquals(new Coordinate(2, -2), rover.move());

        }

        @Test
        void givenFacingSouthOnNewPosition_WhenMove_ThenShouldReturnNewCoordinate() {
            Rover rover = new Rover(Direction.S, new Coordinate(3, -3));
            Assertions.assertEquals(new Coordinate(3, -4), rover.move());
        }

        @Test
        void givenFacingSouthOnNewPosition_WhenMoveThreeTimes_ThenShouldReturnNewCoordinate() {
            Rover rover = new Rover(Direction.S, new Coordinate(3, -3));
            rover.move();
            rover.move();
            Assertions.assertEquals(new Coordinate(3, -6), rover.move());
        }
    }

    @Test
    void givenCoordinate_WhenIsWithinBound_ThenShouldReturnTrue(){

        Coordinate roverCorodinate = new Coordinate(2,3);
        Plateau plateau = new  Plateau();
        Assertions.assertEquals(true,plateau.isWithinBound(roverCorodinate));

    }
}