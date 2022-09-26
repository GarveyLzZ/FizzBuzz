package com.tw.capability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void should_return_Whizz_when_number_contains_seven() {
        //given
        Integer inputNumber1 = 7;
        Integer inputNumber2 = 17;
        Integer inputNumber3 = 75;
        Integer inputNumber4 = 11;

        //when
        String expected1 = fizzBuzz.checkContain7(inputNumber1);
        String expected2 = fizzBuzz.checkContain7(inputNumber2);
        String expected3 = fizzBuzz.checkContain7(inputNumber3);
        String expected4 = fizzBuzz.checkContain7(inputNumber4);
        //then
        assertEquals("Whizz", expected1);
        assertEquals("Whizz", expected2);
        assertEquals("FizzWhizz", expected3);
        assertEquals("11", expected4);
    }

}