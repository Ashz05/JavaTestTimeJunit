package org.Calcapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestCalc {
    Calc calc = new Calc();
    @Test void TestAdd(){
        int result = calc.getAdd(1,2,3,4,5);
        int expected = 15;

        assertEquals(expected,result);
    }
    @Test void TestSubtract(){
        int result = calc.getSubtract(1,2,3,4,5);
        int expected = -13;

        assertEquals(expected,result);
    }

    @Test void TestMultiply(){
        int result = calc.getMultiplication(1,2,3,4,5);
        int expected = 120;

        assertEquals(expected,result);
    }

    @Test void TestDivision(){
        int result = calc.getDivison(10,2,5,0);
        int expected = -1;

        assertEquals(expected,result);
    }


}
