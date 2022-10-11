package com.tw.capability;

import com.tw.capability.rules.*;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author: jiawei.liu
 * @date: 2022/10/10 10:32
 */
public class Student {
    public String getFizzBuzz(String inputNumber) {
        String result = null;
        Optional<String> firstResult = Stream.of(new contained7(), new contained5(), new contained3(), new Default())
                .filter(strategy -> strategy.contained(inputNumber))
                .map(strategy -> strategy.division(inputNumber))
                .findFirst();
        if (firstResult.isPresent()){
            result=firstResult.get();
        }
        return "".equals(result) ? inputNumber : result;
    }
}
