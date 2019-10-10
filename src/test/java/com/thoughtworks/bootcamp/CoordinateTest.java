package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoordinateTest {

    @Test
    void givenCoordinateTwoAndThree_WhenInBetweenThenBoundary_ThenShouldReturnTrue() {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Coordinate coordinate = new Coordinate(2, 3);
        Assertions.assertTrue(coordinate.isBetween(upperCoordinate));
    }

    @Test
    void givenCoordinateSevenAndThree_WhenInBetweenThenBoundary_ThenShouldReturnTrue() {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Coordinate coordinate = new Coordinate(7, 3);
        Assertions.assertFalse(coordinate.isBetween(upperCoordinate));
    }

    @Test
    void givenCoordinateSevenAndminusThree_WhenInBetweenThenBoundary_ThenShouldReturnTrue() {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Coordinate coordinate = new Coordinate(7, -3);
        Assertions.assertFalse(coordinate.isBetween(upperCoordinate));
    }

    @Test
    void givenCoordinateminusSevenAndminusNine_WhenInBetweenThenBoundary_ThenShouldReturnTrue() {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Coordinate coordinate = new Coordinate(-7, -9);
        Assertions.assertFalse(coordinate.isBetween(upperCoordinate));
    }
}
