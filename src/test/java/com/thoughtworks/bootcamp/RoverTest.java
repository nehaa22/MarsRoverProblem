package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Exception.RoverAlreadyDeadException;
import com.thoughtworks.bootcamp.Exception.RoverDeadException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoverTest {

    private Coordinate origin() {
        return new Coordinate(0, 0);
    }

    @Nested
    class Left {

        @Test
        void givenFacingNorth_WhenTurnLeft_ThenShouldFaceWest() throws RoverAlreadyDeadException {
            Rover rover = new Rover(Direction.N, origin(), new Plateau());
            assertEquals(Direction.W, rover.turnLeft());
        }

        @Test
        void givenFacingSouth_WhenTurnLeft_ThenShouldFaceEast() throws RoverAlreadyDeadException {
            Rover rover = new Rover(Direction.S, origin(), new Plateau());
            assertEquals(Direction.E, rover.turnLeft());
        }

        @Test
        void givenFacingEast_WhenTurnLeft_ThenShouldFaceNorth() throws RoverAlreadyDeadException {
            Rover rover = new Rover(Direction.E, origin(), new Plateau());
            assertEquals(Direction.N, rover.turnLeft());
        }

        @Test
        void givenFacingWest_WhenTurnLeft_ThenShouldFaceSouth() throws RoverAlreadyDeadException {
            Rover rover = new Rover(Direction.W, origin(), new Plateau());
            assertEquals(Direction.S, rover.turnLeft());
        }

        @Test
        void givenFacingWest_WhenTurnLeftThreeTimes_ThenShouldFaceNorth() throws RoverAlreadyDeadException {
            Rover rover = new Rover(Direction.W, origin(), new Plateau());
            rover.turnLeft();
            rover.turnLeft();
            assertEquals(Direction.N, rover.turnLeft());
        }

    }

    @Nested
    class Right {

        @Test
        void givenFacingNorth_WhenTurnRight_ThenShouldFaceEast() throws RoverAlreadyDeadException {
            Rover rover = new Rover(Direction.N, origin(), new Plateau());
            assertEquals(Direction.E, rover.turnRight());
        }

        @Test
        void givenFacingEast_WhenTurnRight_ThenShouldFaceSouth() throws RoverAlreadyDeadException {
            Rover rover = new Rover(Direction.E, origin(), new Plateau());
            assertEquals(Direction.S, rover.turnRight());
        }

        @Test
        void givenFacingSouth_WhenTurnRight_ThenShouldFaceWest() throws RoverAlreadyDeadException {
            Rover rover = new Rover(Direction.S, origin(), new Plateau());
            assertEquals(Direction.W, rover.turnRight());
        }

        @Test
        void givenFacingWest_WhenTurnRight_ThenShouldFaceNorth() throws RoverAlreadyDeadException {
            Rover rover = new Rover(Direction.W, origin(), new Plateau());
            assertEquals(Direction.N, rover.turnRight());
        }

        @Test
        void givenFacingWest_WhenTurnRightThreeTimes_ThenShouldFaceSouth() throws RoverAlreadyDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));

            Rover rover = new Rover(Direction.W, origin(), plateau);
            rover.turnRight();
            rover.turnRight();
            assertEquals(Direction.S, rover.turnRight());
        }
    }

    @Nested
    class MoveFromOrigin {

        @Test
        void givenFacingSouth_WhenMove_ThenShouldReturnNewCoordinate() throws RoverDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));
            Rover rover = new Rover(Direction.S, origin(), plateau);
            assertThrows(RoverDeadException.class, rover::move);

        }

        @Test
        void givenFacingEast_WhenMove_ThenShouldReturnNewCoordinate() throws RoverDeadException {

            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));
            Rover rover = new Rover(Direction.E, origin(), plateau);
            assertEquals(new Coordinate(1, 0), rover.move());

        }

        @Test
        void givenFacingWest_WhenMove_ThenShouldReturnNewCoordinate() throws RoverDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));
            Rover rover = new Rover(Direction.W, origin(), plateau);
            assertThrows(RoverDeadException.class, rover::move);

        }

        @Test
        void givenFacingNorth_WhenMove_ThenShouldReturnNewCoordinate() throws RoverDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));
            Rover rover = new Rover(Direction.N, origin(), plateau);
            assertEquals(new Coordinate(0, 1), rover.move());

        }
    }

    @Nested
    class MoveFromAnyCoordinate {
        @Test
        void givenFacingWestOnNewPosition_WhenMove_ThenShouldReturnNewCoordinate() throws RoverDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));

            Rover rover = new Rover(Direction.W, new Coordinate(2, 2), plateau);
            assertEquals(new Coordinate(1, 2), rover.move());

        }

        @Test
        void givenFacingNorthOnNewPosition_WhenMove_ThenShouldReturnNewCoordinate() throws RoverDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));

            Rover rover = new Rover(Direction.N, new Coordinate(3, 2), plateau);
            assertEquals(new Coordinate(3, 3), rover.move());

        }

        @Test
        void givenFacingEastOnNewPosition_WhenMove_ThenShouldReturnNewCoordinate() throws RoverDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));

            Rover rover = new Rover(Direction.E, new Coordinate(1, 2), plateau);
            assertEquals(new Coordinate(2, 2), rover.move());

        }

        @Test
        void givenFacingSouthOnNewPosition_WhenMove_ThenShouldReturnNewCoordinate() throws RoverDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));

            Rover rover = new Rover(Direction.S, new Coordinate(3, 3), plateau);
            assertEquals(new Coordinate(3, 2), rover.move());
        }

        @Test
        void givenFacingSouthOnNewPosition_WhenMoveThreeTimes_ThenShouldReturnNewCoordinate() throws RoverDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));

            Rover rover = new Rover(Direction.S, new Coordinate(3, 3), plateau);
            rover.move();
            rover.move();
            assertEquals(new Coordinate(3, 0), rover.move());
        }
    }

    @Nested
    class RoverThrowException {

        @Test
        void givenWhenDeadRoverFacingNorth_WhenMove_ThenShouldThrowRoverDeadException() throws RoverDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));
            Rover rover = new Rover(Direction.N, new Coordinate(4, 5), plateau);
            Assertions.assertThrows(RoverDeadException.class, rover::move);

        }

        @Test
        void givenFacingNorthOnBoundaryPosition_WhenTurnRight_ThenShouldThrowRoadAlreadyDeadException() throws RoverAlreadyDeadException, RoverDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));

            Rover rover = new Rover(Direction.N, new Coordinate(4, 5), plateau);
            assertThrows(RoverDeadException.class, rover::move);
            assertThrows(RoverAlreadyDeadException.class, rover::turnRight);

        }

        @Test
        void givenFacingNorthOnBoundaryPosition_WhenTurnLeft_ThenShouldThrowRoadAlreadyDeadException() throws RoverAlreadyDeadException, RoverDeadException {
            Plateau plateau = new Plateau(new Coordinate(5, 5), new Coordinate(0, 0));

            Rover rover = new Rover(Direction.N, new Coordinate(7, 8), plateau);
            assertThrows(RoverDeadException.class, rover::move);
            assertThrows(RoverAlreadyDeadException.class, rover::turnLeft);

        }
    }


}