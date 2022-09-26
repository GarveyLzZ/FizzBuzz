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
        assertNull(expected4);
    }

    @Test
    void should_return_Buzz_when_number_contains_five() {
        //given
        Integer inputNumber1 = 5;
        Integer inputNumber2 = 35;
        Integer inputNumber3 = 75;
        Integer inputNumber4 = 15;
        Integer inputNumber5 = 14;

        //when
        String expected1 = fizzBuzz.checkContain5(inputNumber1);
        String expected2 = fizzBuzz.checkContain5(inputNumber2);
        String expected3 = fizzBuzz.checkContain5(inputNumber3);
        String expected4 = fizzBuzz.checkContain5(inputNumber4);
        String expected5 = fizzBuzz.checkContain5(inputNumber5);
        //then
        assertEquals("Buzz", expected1);
        assertEquals("BuzzWhizz", expected2);
        assertEquals("FizzWhizz", expected3);
        assertEquals("Buzz", expected4);
        assertNull(expected5);

    }

    @Test
    void should_return_Fizz_when_number_contains_three() {
        //given
        Integer inputNumber1 = 3;
        Integer inputNumber2 = 13;
        Integer inputNumber3 = 14;
        Integer inputNumber4 = 35;
        Integer inputNumber5 = 75;
        //when
        String expected1 = fizzBuzz.checkContain3(inputNumber1);
        String expected2 = fizzBuzz.checkContain3(inputNumber2);
        String expected3 = fizzBuzz.checkContain3(inputNumber3);
        String expected4 = fizzBuzz.checkContain3(inputNumber4);
        String expected5 = fizzBuzz.checkContain3(inputNumber5);
        //then
        assertEquals("Fizz", expected1);
        assertEquals("Fizz", expected2);
        assertNull(expected3);
        assertEquals("BuzzWhizz", expected4);
        assertEquals("FizzWhizz",expected5);
    }
}