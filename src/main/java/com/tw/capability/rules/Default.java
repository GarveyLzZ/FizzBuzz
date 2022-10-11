package com.tw.capability.rules;

import com.tw.capability.Strategy;

public class Default implements Strategy {

    @Override
    public boolean contained(String number) {
        return true;
    }

    @Override
    public String division(String divisionNumber) {
        int number = Integer.parseInt(divisionNumber);

        StringBuilder stringBuilder = new StringBuilder();
        if (number % 3 == 0) {
            stringBuilder.append("Fizz");
        }
        if (number % 5 == 0) {
            stringBuilder.append("Buzz");
        }
        if (number % 7 == 0) {
            stringBuilder.append("Whizz");
        }
        if (stringBuilder.isEmpty()){
            stringBuilder.append(divisionNumber);
        }
        return stringBuilder.toString();
    }
}
