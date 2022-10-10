package com.tw.capability.rules;

import com.tw.capability.Strategy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: jiawei.liu
 * @date: 2022/10/10 09:58
 */
public class contained5 implements Strategy {
    @Override
    public boolean contained(String number) {
        return number.contains("5");
    }

    @Override
    public String division(String number) {
        return Stream.of(new division5(), new division7())
                .filter(division5 -> division5.contained(number))
                .map(strategy -> strategy.division(number))
                .collect(Collectors.joining());
    }
}
