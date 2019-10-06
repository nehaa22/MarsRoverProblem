package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.thoughtworks.bootcamp.Direction.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest { private Direction north,west,east,south;

    @BeforeEach
    void  setUp(){
        north = N;
        west = W;
        east = E;
        south=S;
    }

    @Test
    void givenDirectionNorth_WhenTurnLeft_ThenShouldReturnWest()
    {
        assertEquals(W, north.turnLeft());
    }

    @Test
    void givenDirectionWest_WhenTurnLeft_ThenShouldReturnSouth() { assertEquals(S, west.turnLeft()); }

    @Test
    void givenDirectionEast_WhenTurnLeft_ThenShouldReturnNorth() { assertEquals(N, east.turnLeft()); }

    @Test
    void givenDirectionSouth_WhenTurnLeft_ThenShouldReturnEast() { assertEquals(E, south.turnLeft()); }

    @Test
    void givenDirectionNorth_WhenTurnRight_ThenShouldReturnEast() { assertEquals(E, north.turnRight()); }

    @Test
    void givenDirectionEast_WhenTurnRight_ThenShouldReturnSouth() { assertEquals(S, east.turnRight()); }



}
