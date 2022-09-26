package com.tw.capability;

public class FizzBuzz {

    public String checkContain7(Integer inputNumber) {
        if (inputNumber.toString().contains("7") && inputNumber % 3 == 0) {
            return "FizzWhizz";
        }
        if (inputNumber.toString().contains("7")) {
            return "Whizz";
        }
        return null;
    }

    public String checkContain5(Integer inputNumber) {
        if (inputNumber.toString().contains("7")){
            return this.checkContain7(inputNumber);
        }
        if (inputNumber.toString().contains("5") && inputNumber % 7 == 0) {
            return "BuzzWhizz";
        }
        if (inputNumber.toString().contains("5")) {
            return "Buzz";
        }
        return null;
    }

    public String checkContain3(Integer inputNumber) {
        if (inputNumber.toString().contains("7")){
            return this.checkContain7(inputNumber);
        }
        if (inputNumber.toString().contains("5")){
            return this.checkContain5(inputNumber);
        }
        if (inputNumber.toString().contains("3")) {
            return "Fizz";
        }
        return null;
    }

    public String checkThreeAndSeven(Integer inputNumber) {
        if (inputNumber.toString().contains("7")){
            return this.checkContain7(inputNumber);
        }
        if (inputNumber.toString().contains("5")){
            return this.checkContain5(inputNumber);
        }
        if (inputNumber.toString().contains("3")) {
            return this.checkContain3(inputNumber);
        }
        if (inputNumber % 3 == 0 && inputNumber % 7 ==0){
            return "FizzWhizz";
        }
        return null;
    }
}
