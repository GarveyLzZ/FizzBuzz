package com.tw.capability.rules;

import com.tw.capability.Strategy;

public class Division3 implements Strategy {

    @Override
    public boolean contained(String number) {
        return Integer.parseInt(number) % 3 == 0;
    }

    @Override
    public String division(String divisionNumber) {
        return this.contained(divisionNumber) ? "Fizz" : "";
    }
}
