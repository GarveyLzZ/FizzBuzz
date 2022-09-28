package com.tw.capability;

public class Main {
    public static void main(String[] args) {
        Check check = new Check();
        System.out.println(check.checkNumber(args[0]));
        for (int i = 1; i < 30; i++) {
            System.out.println(check.checkNumber(String.valueOf(i)));
        }
    }
}