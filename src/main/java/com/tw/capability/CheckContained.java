package com.tw.capability;

public class CheckContained implements Contained {
    @Override
    public boolean checkContainedAndDivided(String inputNumber, int containedNumber, int dividedNumber, String answer) {
        return Contained.isDivided(inputNumber, dividedNumber) && Contained.isContains(inputNumber, containedNumber);
    }

    @Override
    public boolean checkContained(String inputNumber, int containedNumber, String answer) {
        return Contained.isContains(inputNumber, containedNumber);
    }

}
