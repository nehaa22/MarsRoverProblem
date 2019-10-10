package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlateauTest {

    @Test
    void givenCoordinateTwoAndThree_WhenIsWithinBound_ThenShouldReturnTrue() {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Plateau plateau = new Plateau(upperCoordinate);

        Coordinate roverCoordinate = new Coordinate(2, 3);
        Assertions.assertTrue(plateau.isWithinBound(roverCoordinate));

    }

    @Test
    void givenCoordinate_WhenIsWithinBound_ThenShouldReturnTrue() {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Plateau plateau = new Plateau(upperCoordinate);

        Coordinate roverCoordinate = new Coordinate(8, 9);
        Assertions.assertFalse(plateau.isWithinBound(roverCoordinate));

    }

}
