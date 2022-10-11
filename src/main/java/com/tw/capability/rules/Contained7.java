package com.tw.capability.rules;

import com.tw.capability.Strategy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Contained7 implements Strategy {
    @Override
    public boolean contained(String number) {
        return number.contains("7");
    }

    @Override
    public String division(String number) {
        return Stream.of(new Division3(), new Division7())
                .map(strategy -> strategy.division(number))
                .collect(Collectors.joining());
    }
}
