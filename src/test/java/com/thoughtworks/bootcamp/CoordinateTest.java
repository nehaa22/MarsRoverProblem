package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Exception.RoverDeadException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoordinateTest {

    @Test
    void givenCoordinateTwoAndThree_WhenInBetweenThenBoundary_ThenShouldReturnTrue() throws RoverDeadException {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Coordinate lowerCoordinate = new Coordinate(0,0);
        Coordinate coordinate = new Coordinate(2, 3);
        Assertions.assertTrue(coordinate.isBetween(lowerCoordinate, upperCoordinate));
    }

    @Test
    void givenCoordinateSevenAndThree_WhenInBetweenThenBoundary_ThenShouldReturnTrue() throws RoverDeadException {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Coordinate lowerCoordinate = new Coordinate(0,0);

        Coordinate coordinate = new Coordinate(7, 3);
        Assertions.assertFalse(coordinate.isBetween(lowerCoordinate, upperCoordinate));
    }

    @Test
    void givenCoordinateSevenAndMinusThree_WhenInBetweenThenBoundary_ThenShouldReturnTrue() throws RoverDeadException {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Coordinate lowerCoordinate = new Coordinate(0,0);

        Coordinate coordinate = new Coordinate(7, -3);
        Assertions.assertFalse(coordinate.isBetween(lowerCoordinate,upperCoordinate));
    }

    @Test
    void givenCoordinateminusSevenAndminusNine_WhenInBetweenThenBoundary_ThenShouldReturnTrue() throws RoverDeadException {
        Coordinate upperCoordinate = new Coordinate(5, 5);

        Coordinate lowerCoordinate = new Coordinate(0,0);
        Coordinate coordinate = new Coordinate(-7, -9);
        Assertions.assertFalse(coordinate.isBetween(upperCoordinate, lowerCoordinate));
    }
}
