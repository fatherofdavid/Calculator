package com.annapolisworks;

public class ParseUtil {
    public static OpNode parse(String expr) {
        Operator myOperator = Operator.makeOperator('+');

        //create a 0+0 first node to be overwritten / in case user enters a single number
        OpNode firstNode;
        OpNode thisNode = new OpNode(null,null,Operator.makeOperator('+'),0d,0d);

        char c;
        int index = 0;
        int decimalDepth = 0;
        StringBuilder sb;
        while(index < expr.length()){
            c = expr.charAt(index);

            if (Character.isSpaceChar(c)) {
                index++;
            } else if (Character.isDigit(c) || (c == '.' && decimalDepth == 0) ) {
                decimalDepth = 1;
                double thisDouble = parseNumber();
                //do something
            } else if (Operator.isOperator(c)) {
                //do something
            } else {
                throw new RuntimeException("There is an unsupported character in your expression.");
            }
        }
        //need error checking for null string

        return firstNode;
    }

    private static double parseNumber() {
        return 0d; //delete this and fix what is below... //620
        //while(c == )
        //decimalDepth = 0;
        //return Double.parseDouble(sb.ToString());
    }
}
