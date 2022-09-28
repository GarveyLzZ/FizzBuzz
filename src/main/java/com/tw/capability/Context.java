package com.tw.capability;

public class Context {
    private final Contained contained;

    public Context(Contained contained) {
        this.contained = contained;
    }

    public boolean containedAndDivided(String inputNumber, int containedNumber, int dividedNumber, String answer) {
        return contained.checkContainedAndDivided(inputNumber, containedNumber, dividedNumber, answer);
    }

    public boolean contained(String inputNumber, int containedNumber, String answer) {
        return contained.checkContained(inputNumber, containedNumber, answer);
    }
}
