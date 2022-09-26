package com.tw.capability;

public class Check {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    public String checkNumber(String inputNumber) {

        return switch ((fizzBuzz.checkDivision(inputNumber) == null ? 0 : 1) +
                (fizzBuzz.checkThreeAndSeven(inputNumber) == null ? 0 : 2)) {
            case 3 -> fizzBuzz.checkThreeAndSeven(inputNumber);
            case 1 -> fizzBuzz.checkDivision(inputNumber);
            case 0 -> fizzBuzz.commonNumber(inputNumber);
            default -> inputNumber;
        };
    }
}
