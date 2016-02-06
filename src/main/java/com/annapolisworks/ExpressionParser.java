package com.annapolisworks;

public class ExpressionParser {

    private int mIndex;
    char c;
    double firstNumber;
    double secondNumber;
    Operator thisOperator;
    OpNode firstNode;
    OpNode thisNode;
    private String expr;

    public OpNode parse(String expressionToParse) {
        //need to add provision for 2.3.4 + 1 <- 2 decimals
        //need to add provision for 2+-5 <- would simply read over first operator

        expr = expressionToParse;
        //create a 0+? first node to be overwritten Or in case user enters a single number
        thisOperator = Operator.makeOperator('+');
        firstNumber = 0d;

        mIndex = 0;
        while(mIndex < expr.length()){
            c = expr.charAt(mIndex);

            if (Character.isSpaceChar(c)) {
                mIndex++;
            } else if (Character.isDigit(c) || c == '.') {
                firstNumber = secondNumber;
                secondNumber = parseNumber();
                thisNode = new OpNode(thisNode,null,thisOperator,firstNumber,secondNumber);
                if(firstNode != null) {
                    thisNode.lastNode.nextNode = thisNode;
                }
                thisOperator = null;
                if(firstNode == null) {
                    firstNode = thisNode;
                }
            } else if (Operator.isOperator(c) && thisOperator == null) {
                thisOperator = Operator.makeOperator(c);
                mIndex++;
            } else {
                throw new RuntimeException("There is an unsupported character in your expression.");
            }
        }
        //need error checking for null string
        return firstNode;
    }

    public double parseNumber() {
        StringBuilder sb = new StringBuilder();
        while(mIndex < expr.length()) {
            c = expr.charAt(mIndex);
            if (Character.isDigit(c) || c == '.') {
                c = expr.charAt(mIndex);
                sb.append(c);
            } else {
                break;
            }
            mIndex++;
        }
        return Double.parseDouble(sb.toString());
    }
}
