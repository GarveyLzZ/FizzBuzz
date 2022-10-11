package com.tw.capability.rules;

import com.tw.capability.Strategy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Contained5 implements Strategy {
    @Override
    public boolean contained(String number) {
        return number.contains("5");
    }

    @Override
    public String division(String number) {
        return Stream.of(new Division5(), new Division7())
                .filter(division5 -> division5.contained(number))
                .map(strategy -> strategy.division(number))
                .collect(Collectors.joining());
    }
}
