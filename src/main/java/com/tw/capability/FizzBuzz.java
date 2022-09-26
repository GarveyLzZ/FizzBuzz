package com.tw.capability;

public class FizzBuzz {

    public String checkContain7(String inputNumber) {
        if (inputNumber.contains("7") && Integer.parseInt(inputNumber) % 3 == 0) {
            return "FizzWhizz";
        }
        if (inputNumber.contains("7")) {
            return "Whizz";
        }
        return null;
    }

    public String checkContain5(String inputNumber) {
        if (inputNumber.contains("7")) {
            return this.checkContain7(inputNumber);
        }
        if (inputNumber.contains("5") && Integer.parseInt(inputNumber) % 7 == 0) {
            return "BuzzWhizz";
        }
        if (inputNumber.contains("5")) {
            return "Buzz";
        }
        return null;
    }

    public String checkContain3(String inputNumber) {
        if (inputNumber.contains("7")) {
            return this.checkContain7(inputNumber);
        }
        if (inputNumber.contains("5")) {
            return this.checkContain5(inputNumber);
        }
        if (inputNumber.contains("3")) {
            return "Fizz";
        }
        return null;
    }

    public String checkThreeAndSeven(String inputNumber) {
        if (inputNumber.contains("7")) {
            return this.checkContain7(inputNumber);
        }
        if (inputNumber.contains("5")) {
            return this.checkContain5(inputNumber);
        }
        if (inputNumber.contains("3")) {
            return this.checkContain3(inputNumber);
        }
        if (Integer.parseInt(inputNumber) % 3 == 0 && Integer.parseInt(inputNumber) % 7 == 0) {
            return "FizzWhizz";
        }
        return null;
    }

    public String checkDivision(String inputNumber) {
        if (inputNumber.contains("7")) {
            return this.checkContain7(inputNumber);
        }
        if (inputNumber.contains("5")) {
            return this.checkContain5(inputNumber);
        }
        if (inputNumber.contains("3")) {
            return this.checkContain3(inputNumber);
        }
        int integer = Integer.parseInt(inputNumber);
        if (integer % 3 == 0) {
            return "Fizz";
        }
        if (integer % 5 == 0) {
            return "Buzz";
        }
        if (integer % 7 == 0) {
            return "Whizz";
        }
        return null;
    }

    public String commonNumber(String inputNumber) {
        return inputNumber;
    }
}
