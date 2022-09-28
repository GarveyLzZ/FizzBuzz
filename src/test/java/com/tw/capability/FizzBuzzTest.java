package com.tw.capability;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest
    @MethodSource("com.tw.capability.TestData#ContainSevenArguments")
    void should_return_Whizz_when_number_contains_seven(String inputNumber, String actual) {
        // give

        // when
        String expected = fizzBuzz.checkContain7(inputNumber);
        // then
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @MethodSource("com.tw.capability.TestData#ContainFiveArguments")
    void should_return_Buzz_when_number_contains_five(String inputNumber, String actual) {
        // give

        // when
        String expected = fizzBuzz.checkContain5(inputNumber);
        // then
        assertEquals(actual, expected);
    }

    @ParameterizedTest
    @ValueSource(strings = {"3", "63", "30"})
    void should_return_Fizz_when_number_contains_three(String inputNumber) {
        //given
        String actual = "Fizz";
        //when
        String expected1 = fizzBuzz.checkContain3(inputNumber);
        //then
        assertEquals(actual, expected1);
    }


    @ParameterizedTest
    @MethodSource("com.tw.capability.TestData#DivisionArguments")
    void should_return_FizzBuzzWhizz(String inputNumber, String actual) {
        // give

        // when
        String expected = fizzBuzz.checkDivision(inputNumber);
        // then
        assertEquals(actual, expected);
    }
}