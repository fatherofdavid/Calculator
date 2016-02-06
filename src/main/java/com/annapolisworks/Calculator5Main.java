package com.annapolisworks;

public class Calculator5Main {
    public static void main(String[] args) {
        System.out.println("the program is running.");
        String userInputStr = "1 + 2^2 * 3 -5";
        Expression myExpression = new Expression(userInputStr);
        double solution = myExpression.getValue();
        System.out.println(userInputStr + " = " + solution);
    }
}

//Christ has died, Christ has risen, Christ will come again.
