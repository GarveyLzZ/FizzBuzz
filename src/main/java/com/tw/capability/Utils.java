package com.tw.capability;

import org.jetbrains.annotations.Nullable;

public class Utils {

    @Nullable
    protected static String getContained(boolean isContained, String Fizz) {
        if (isContained) {
            return Fizz;
        }
        return null;
    }

    protected static boolean isDivided(String inputNumber, int dividedNumber) {
        return Integer.parseInt(inputNumber) % dividedNumber == 0;
    }

    protected static boolean isContains(String inputNumber, String containedNumber) {
        return inputNumber.contains(containedNumber);
    }
}
