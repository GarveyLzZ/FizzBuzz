package com.tw.capability;

import com.tw.capability.rules.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author: jiawei.liu
 * @date: 2022/10/10 10:32
 */
public class Student {
    public String getFizzBuzz(String inputNumber) {
//        contained7 contained7 = new contained7();
//        contained5 contained5 = new contained5();
//        contained3 contained3 = new contained3();
//        division3 division3 = new division3();
//        division5 division5 = new division5();
//        division7 division7 = new division7();
//        System.out.println("contained7" + " " + contained7.contained(inputNumber) + " " + contained7.division(inputNumber));
//        System.out.println("contained5" + " " + contained5.contained(inputNumber) + " " + contained5.division(inputNumber));
//        System.out.println("contained3" + " " + contained3.contained(inputNumber) + " " + contained3.division(inputNumber));
//        System.out.println("division3" + " " + division3.contained(inputNumber) + " " + division3.division(inputNumber));
//        System.out.println("division5" + " " + division5.contained(inputNumber) + " " + division5.division(inputNumber));
//        System.out.println("division7" + " " + division7.contained(inputNumber) + " " + division7.division(inputNumber));
        String result = Stream.of(new contained7(), new contained5(), new contained3(), new Default())
                .filter(strategy -> strategy.contained(inputNumber))
                .map(strategy -> strategy.division(inputNumber))
                .distinct()
                .collect(Collectors.joining());
        return "".equals(result) ? inputNumber : result;
    }
}
