package com.tw.capability;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

class TestData {
    static Stream<Arguments> ContainSevenArguments() {
        return Stream.of(
                Arguments.of("7", "Whizz"),
                Arguments.of("17", "Whizz"),
                Arguments.of("75", "Fizz"),
                Arguments.of("157", "Whizz")
        );
    }
    static Stream<Arguments> ContainFiveArguments() {
        return Stream.of(
                Arguments.of("5", "Buzz"),
                Arguments.of("35", "BuzzWhizz"),
                Arguments.of("15", "Buzz"),
                Arguments.of("154", "BuzzWhizz")
        );
    }
    static Stream<Arguments> DivisionArguments() {
        return Stream.of(
                Arguments.of("6", "Fizz"),
                Arguments.of("210", "FizzBuzzWhizz"),
                Arguments.of("60", "FizzBuzz"),
                Arguments.of("140", "BuzzWhizz")
        );
    }
}
