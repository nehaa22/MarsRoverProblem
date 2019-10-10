package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoordinateTest {

    @Test
    void givenCoordinate_WhenBetweenThenBoundary_ThenShouldReturnTrue(){
        Coordinate upperCoordinate = new Coordinate(5,5);
        Coordinate coordinate = new Coordinate(2,3);
        Assertions.assertTrue(coordinate.isBetween(upperCoordinate));
    }
}
