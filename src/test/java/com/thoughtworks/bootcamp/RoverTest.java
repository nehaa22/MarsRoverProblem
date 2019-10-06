package com.thoughtworks.bootcamp;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoverTest {

    @Test
    public void givenInstruction_WhenTurnLeft_ThenShouldTurnLeft() {
        Rover rover = new Rover(Direction.N, new Coordinate(2,2));
       // Assertions.assertTrue(true, rover.move(command));
    }
}