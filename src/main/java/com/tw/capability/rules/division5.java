package com.tw.capability.rules;

import com.tw.capability.Strategy;

/**
 * @author: jiawei.liu
 * @date: 2022/10/10 09:58
 */
public class division5 implements Strategy {

    @Override
    public boolean contained(String number) {
        return Integer.parseInt(number) % 5 == 0;
    }

    @Override
    public String division(String divisionNumber) {
        return new contained7().contained(divisionNumber) ? "" : "Buzz";
    }
}
