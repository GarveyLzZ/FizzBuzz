package com.tw.capability;

import com.tw.capability.rules.*;

import java.util.Optional;
import java.util.stream.Stream;

public class Student {
    public String getFizzBuzz(String inputNumber) {
        String result = null;
        Optional<String> firstResult = Stream.of(new Contained7(), new Contained5(), new Contained3(), new Default())
                .filter(strategy -> strategy.contained(inputNumber))
                .map(strategy -> strategy.division(inputNumber))
                .findFirst();
        if (firstResult.isPresent()){
            result=firstResult.get();
        }
        return "".equals(result) ? inputNumber : result;
    }
}
