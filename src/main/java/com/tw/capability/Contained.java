package com.tw.capability;

public interface Contained {
    boolean checkContainedAndDivided(String inputNumber, int containedNumber, int dividedNumber, String answer);

    boolean checkContained(String inputNumber, int containedNumber, String answer);

    static boolean isDivided(String inputNumber, int dividedNumber) {
        return Integer.parseInt(inputNumber) % dividedNumber == 0;
    }

    static boolean isContains(String inputNumber, int containedNumber) {
        return inputNumber.contains(String.valueOf(containedNumber));
    }
}
