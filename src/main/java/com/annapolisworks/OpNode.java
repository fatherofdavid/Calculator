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

    public void simplifyAndCollapse(){
        boolean finished = true;
        double value = operator.performOperation(lastNumber,nextNumber);
        if(lastNode != null){
            lastNode.nextNumber = value;
            lastNode.nextNode = nextNode;
            finished = false;
        }
        if(nextNode != null){
            nextNode.lastNumber = value;
            nextNode.lastNode = lastNode;
            finished = false;
        }
        if(finished){
            lastNumber = value;
        }
    }

    //3^4+2*2+5^2
    //: 3^4,4+2,2*2,2+5,5^2
    //: 7,7+2,2*2,2+5,5^2
    //:  ,4+2,2*2,2+,5^2


    //this is overwritten to support testability
    @Override public String toString() {
        return Double.toString(lastNumber)+","+operator.toString()+","+Double.toString(nextNumber);
    }

}
