package com.annapolisworks;

public class OpNode {

    public OpNode lastNode;
    public OpNode nextNode;
    public Operator operator;
    public double lastNumber;
    public double nextNumber;

    public OpNode(OpNode myLastNode, OpNode myNextNode, Operator myOperator, double myLastNumber, double myNextNumber) {
        lastNode = myLastNode;
        nextNode = myNextNode;
        operator = myOperator;
        lastNumber = myLastNumber;
        nextNumber = myNextNumber;
    }

    public void simplifyAndCollapse() {
        boolean finished = true;
        double value = operator.performOperation(lastNumber,nextNumber);
        if (lastNode != null) {
            lastNode.nextNumber = value;
            lastNode.nextNode = nextNode;
            finished = false;
        }
        if (nextNode != null) {
            nextNode.lastNumber = value;
            nextNode.lastNode = lastNode;
            finished = false;
        }
        if (finished) {
            lastNumber = value;
        }
    }

    //this is overwritten to support testability
    @Override public String toString() {
        return Double.toString(lastNumber)+"|"+operator.toString()+"|"+Double.toString(nextNumber);
    }

}
