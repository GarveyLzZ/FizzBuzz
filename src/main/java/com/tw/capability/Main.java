package com.tw.capability;

public class Main {
    public static void main(String[] args) {
        String inputNumber = "31";
        Student student = new Student();
        String result = student.getFizzBuzz(inputNumber);
        System.out.println(result);
    }
}