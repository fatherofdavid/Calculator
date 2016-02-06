package com.annapolisworks;

public class Calculator5Main {
    public static void main(String[] args) {
        String userInputStr = "1 + 2^2 * 3 -5 +2*3^ 2";
        Expression myExpression = new Expression(userInputStr);
        double solution = myExpression.getValue();
        System.out.println(userInputStr + " = " + solution);
    }
}

//Christ has died, Christ has risen, Christ will come again.
