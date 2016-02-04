package com.annapolisworks;

public class OpNode {
    public OpNode mLastNode;
    public OpNode mNextNode;
    public Operator mOperator;
    public double mLastNumber;
    public double mNextNumber;


    //constructor
    OpNode(OpNode lastNode, OpNode nextNode, Operator operator, double lastNumber, double nextNumber) {
        OpNode mLastNode = lastNode;
        OpNode mNextNode = nextNode;
        Operator mOperator = operator;
        mLastNumber = lastNumber;
        mNextNumber = nextNumber;

    }
    //need get/set functionality
    //need fxn to simplify and annex next node;
}
