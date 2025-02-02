package Tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    Calculator c = new Calculator();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add(){
        int expected = 10;
        assertEquals(expected,c.add(5,5));
    }

    @Test
    void subtract(){
        int expected = 30;
        assertEquals(expected,c.subtract(40,10));
    }

    @Test
    void multiply(){
        int expected = 100;
        assertEquals(expected,c.multiply(10,10));
    }

    @Test
    void divide(){
        int expected = 4;
        assertEquals(expected,c.divide(20,5));
    }


}