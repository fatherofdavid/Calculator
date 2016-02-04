package com.annapolisworks;

public enum Operator {
    PLUS('+', 1),
    MINUS('-', 1),
    MULTIPLY('*', 2),
    DIVIDE('/', 2),
    EXPONENT('^', 3);

    private char mOper;
    private int mPriority;

    Operator(char operator, int priority) {
        mOper = operator;
        mPriority = priority;
    }

    char getOper() {
        return mOper;
    }


    static Operator makeOperator(char c) {
        for (Operator tempOp : Operator.values()) {
            if (c == tempOp.getOper()) {
                return tempOp;
            }
        }
        throw new RuntimeException("you tried to parse an unsupported operator.");
    }

    static boolean isOperator(char c) {
        for (Operator tempOp : Operator.values()) {
            if (c == tempOp.getOper()) {
                return true;
            }
        }
        return false;
    }

}

//still not quite sure how to CALL this guy
//partially built to get rid of errors, needs finished