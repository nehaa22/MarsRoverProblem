package com.thoughtworks.bootcamp;

import com.thoughtworks.bootcamp.Exception.RoverDeadException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlateauTest {

    @Test
    void givenCoordinateTwoAndThree_WhenIsWithinBound_ThenShouldReturnTrue() throws RoverDeadException {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Plateau plateau = new Plateau(upperCoordinate);

        Coordinate roverCoordinate = new Coordinate(2, 3);
        Assertions.assertTrue(plateau.isWithinBound(roverCoordinate));

    }

    @Test
    void givenCoordinateEightAndNine_WhenIsWithinBound_ThenShouldReturnTrue() throws RoverDeadException {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Plateau plateau = new Plateau(upperCoordinate);

        Coordinate roverCoordinate = new Coordinate(8, 9);
        Assertions.assertFalse(plateau.isWithinBound(roverCoordinate));

    }

    @Test
    void givenCoordinateFourAndThree_WhenIsWithinBound_ThenShouldReturnTrue() throws RoverDeadException {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Plateau plateau = new Plateau(upperCoordinate);

        Coordinate roverCoordinate = new Coordinate(4, 3);
        Assertions.assertTrue(plateau.isWithinBound(roverCoordinate));

    }

    @Test
    void givenCoordinateThreeAndThree_WhenIsWithinBound_ThenShouldReturnTrue() throws RoverDeadException {
        Coordinate upperCoordinate = new Coordinate(5, 5);
        Plateau plateau = new Plateau(upperCoordinate);

        Coordinate roverCoordinate = new Coordinate(3, 3);
        Assertions.assertTrue(plateau.isWithinBound(roverCoordinate));

    }

}
