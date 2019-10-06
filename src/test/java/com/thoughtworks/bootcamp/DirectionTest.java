package com.thoughtworks.bootcamp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.thoughtworks.bootcamp.Direction.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectionTest { private Direction north,west;

    @BeforeEach
    void  setUp(){
        north = N;
        west = W;

    }

    @Test
    void givenDirectionNorth_WhenTurnLeft_ThenShouldReturnWest()
    {
        assertEquals(W, north.turnLeft());
    }


}
