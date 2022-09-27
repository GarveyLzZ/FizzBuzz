package com.tw.capability;

public class Check {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    public String checkNumber(String inputNumber) {
        return fizzBuzz.checkContain7(inputNumber);
    }
}
