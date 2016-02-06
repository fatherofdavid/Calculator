package com.annapolisworks;

public class OpNode {

    public OpNode lastNode;
    public OpNode nextNode;
    public Operator operator;
    public double lastNumber;
    public double nextNumber;


    //constructor
    OpNode(OpNode myLastNode, OpNode myNextNode, Operator myOperator, double myLastNumber, double myNextNumber) {
        lastNode = myLastNode;
        nextNode = myNextNode;
        operator = myOperator;
        lastNumber = myLastNumber;
        nextNumber = myNextNumber;
    }
    //need get/set functionality
    //need fxn to simplify and annex next node;

    @Override public String toString() {
        return Double.toString(lastNumber)+","+operator.toString()+","+Double.toString(nextNumber);
    }

}
