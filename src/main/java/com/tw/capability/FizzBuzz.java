package com.tw.capability;

public class FizzBuzz {

    public String checkContain7(String inputNumber) {
        String contained = Utils.getContained(Utils.isContains(inputNumber, "7") &&
                Utils.isDivided(inputNumber,3), "Fizz");
        if (contained != null) return contained;

        contained = Utils.getContained(Utils.isContains(inputNumber, "7"), "Whizz");
        if (contained != null) return contained;
        return this.checkContain5(inputNumber);
    }

    public String checkContain5(String inputNumber) {
        String contained = Utils.getContained(Utils.isContains(inputNumber, "5") &&
                Utils.isDivided(inputNumber,7), "BuzzWhizz");
        if (contained != null) return contained;

        contained = Utils.getContained(Utils.isContains(inputNumber, "5"), "Buzz");
        if (contained != null) return contained;

        return this.checkContain3(inputNumber);
    }

    public String checkContain3(String inputNumber) {
        String Fizz = Utils.getContained(Utils.isContains(inputNumber, "3"), "Fizz");
        if (Fizz != null) return Fizz;

        return this.checkDivision(inputNumber);
    }

    public String checkDivision(String inputNumber) {
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
        return ans.toString();
    }
}
