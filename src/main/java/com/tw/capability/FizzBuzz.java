package com.tw.capability;

import java.util.Optional;

public class FizzBuzz {

    static Context context;

    private static String getContainedAndDivision(String inputNumber, int containedNumber, int dividedNumber, String answer) {
        context = new Context(new CheckContained());
        if (context.containedAndDivided(inputNumber, containedNumber, dividedNumber, answer)) {
            return answer;
        }
        return null;

    }

    private static String getContained(String inputNumber, int containedNumber, String answer) {
        if (context.contained(inputNumber, containedNumber, answer)) {
            return answer;
        }
        return null;
    }

    public String checkContain7(String inputNumber) {
        return Optional.ofNullable(getContainedAndDivision(inputNumber, 7, 3, "Fizz")).
                orElse((getContained(inputNumber, 7, "Whizz")));
    }

    public String checkContain5(String inputNumber) {
        Optional<String> containSeven = Optional.ofNullable(checkContain7(inputNumber));

        return containSeven.orElse(Optional.ofNullable(getContainedAndDivision(inputNumber, 5, 7, "BuzzWhizz")).
                orElse((getContained(inputNumber, 5, "Buzz"))));
    }

    public String checkContain3(String inputNumber) {

        Optional<String> containFive = Optional.ofNullable(checkContain5(inputNumber));

        return containFive.orElse(getContained(inputNumber, 3, "Fizz"));
    }

    public String checkDivision(String inputNumber) {
        Optional<String> containThree = Optional.ofNullable(checkContain5(inputNumber));

        int integer = Integer.parseInt(inputNumber);
        StringBuilder ans = new StringBuilder();
        if (integer % 3 == 0) {
            ans.append("Fizz");
        }
        if (integer % 5 == 0) {
            ans.append("Buzz");
        }
        if (integer % 7 == 0) {
            ans.append("Whizz");
        }
        if (ans.length() == 0)
            return inputNumber;
        return containThree.orElse(ans.toString());
    }
}
