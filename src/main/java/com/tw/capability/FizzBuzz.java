package com.tw.capability;

public class FizzBuzz {

    public String checkContain7(Integer inputNumber) {
        if (inputNumber.toString().contains("7") && inputNumber % 3 == 0) {
            return "FizzWhizz";
        } else if (inputNumber.toString().contains("7")) {
            return "Whizz";
        }
        return inputNumber.toString();
    }
}
