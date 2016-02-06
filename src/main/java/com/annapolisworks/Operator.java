package com.annapolisworks;

public enum Operator{
    PLUS('+', 1){
        @Override public double performOperation(double val1, double val2){
            return (val1 + val2);
        }
    },
    MINUS('-', 1){
        @Override public double performOperation(double val1, double val2){
            return (val1 - val2);
        }
    },
    MULTIPLY('*', 2){
        @Override public double performOperation(double val1, double val2){
            return (val1 * val2);
        }
    },
    DIVIDE('/', 2){
        @Override public double performOperation(double val1, double val2){
            return (val1 / val2);
        }
    },
    EXPONENT('^', 3){
        @Override public double performOperation(double val1, double val2){
            return Math.pow(val1,val2);
        }
    };

    private char mOper;
    private int mPriority;

    Operator(char operator, int priority) {
        mOper = operator;
        mPriority = priority;
    }

    char getOper() {
        return mOper;
    }
    int getPriority() {return mPriority;}


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

    public double performOperation(double val1, double val2){
        throw new RuntimeException("Error in Operator Enum.");
    }

    @Override public String toString() {
        return ""+mOper;
    }

}

//still not quite sure how to CALL this guy
//partially built to get rid of errors, needs finished