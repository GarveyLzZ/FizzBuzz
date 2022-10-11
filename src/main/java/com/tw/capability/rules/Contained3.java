package com.tw.capability.rules;

import com.tw.capability.Strategy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Contained3 implements Strategy {
    @Override
    public boolean contained(String number) {
        return number.contains("3");
    }

    @Override
    public String division(String number) {
        return this.contained(number) ? "Fizz" : Stream.of(new Division3())
                .filter(contained5 -> contained5.contained(number))
                .map(strategy -> strategy.division(number))
                .collect(Collectors.joining());
    }
}
