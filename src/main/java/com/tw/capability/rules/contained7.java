package com.tw.capability.rules;

import com.tw.capability.Strategy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: jiawei.liu
 * @date: 2022/10/10 09:58
 */
public class contained7 implements Strategy {
    @Override
    public boolean contained(String number) {
        return number.contains("7");
    }

    @Override
    public String division(String number) {
        return Stream.of(new division3(), new division7())
                .map(strategy -> strategy.division(number))
                .collect(Collectors.joining());
    }
}
