package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoordinateTest {

    @Test
    public  void whenGivenTwoCoordinate_WhenIsAbovePlane_ThenShoudReturnTrue(){
        int x =2;
        int y = 3;
        Coordinate coordinate = new Coordinate(x,y);
        Assertions.assertTrue(coordinate.isAbove(new Coordinate(5,5)));
    }
}
