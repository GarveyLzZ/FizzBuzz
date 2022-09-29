package com.tw.capability;

import java.util.Optional;

public class Check {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    public String checkNumber(String inputNumber) {
        return Optional.ofNullable(
                        Optional.ofNullable(
                                        Optional.ofNullable(fizzBuzz.checkContain7(inputNumber)).
                                                orElse(fizzBuzz.checkContain5(inputNumber))).
                                orElse(fizzBuzz.checkContain3(inputNumber))).
                orElse(fizzBuzz.checkDivision(inputNumber));
    }
}
