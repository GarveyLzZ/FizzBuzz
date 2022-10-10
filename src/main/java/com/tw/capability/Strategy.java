package com.tw.capability;

/**
 * @author: jiawei.liu
 * @date: 2022/10/10 09:47
 */
public interface Strategy {

    boolean contained(String number);

    String division(String divisionNumber);
}
