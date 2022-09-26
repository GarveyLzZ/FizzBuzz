package com.tw.capability;

public class Check {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    public String checkNumber(String inputNumber) {
        String response = fizzBuzz.checkContain7(inputNumber);
        if (response != null) {
            return response;
        }

        response = fizzBuzz.checkContain5(inputNumber);
        if (response != null) {
            return response;
        }

        response = fizzBuzz.checkContain3(inputNumber);
        if (response != null) {
            return response;
        }

        response = fizzBuzz.checkThreeAndSeven(inputNumber);
        if (response != null) {
            return response;
        }

        response = fizzBuzz.checkDivision(inputNumber);
        if (response != null) {
            return response;
        }

        return fizzBuzz.commonNumber(inputNumber);
    }
}
