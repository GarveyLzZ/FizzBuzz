package com.tw.capability.rules;

import com.tw.capability.Strategy;

import java.util.stream.Stream;

/**
 * @author: jiawei.liu
 * @date: 2022/10/10 17:23
 */
public class Default implements Strategy {

    @Override
    public boolean contained(String number) {
        return Stream.of(new Contained3(), new contained5(), new contained7())
                .noneMatch(strategy -> strategy.contained(number));
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
