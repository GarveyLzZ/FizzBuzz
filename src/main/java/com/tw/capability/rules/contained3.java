package com.tw.capability.rules;

import com.tw.capability.Strategy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: jiawei.liu
 * @date: 2022/10/10 09:58
 */
public class contained3 implements Strategy {
    @Override
    public boolean contained(String number) {
        return number.contains("3");
    }

    @Override
    public String division(String number) {
        return !Stream.of(new contained5())
                .filter(contained5 -> contained5.contained(number))
                .map(strategy -> strategy.division(number))
                .collect(Collectors.joining()).isEmpty() ? "" : "Fizz";
    }
}
