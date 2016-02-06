package com.annapolisworks;

public class Expression {

    private String mExpr;
    Expression(String expr) {
        mExpr = expr;
    }

    public double getValue() {
        ExpressionParser myParser = new ExpressionParser();
        OpNode firstNode = myParser.parse(mExpr);
        OpNode thisNode;
        int highestPriority;
        do {
            thisNode = firstNode;
            highestPriority = 0;
            while (thisNode.nextNode != null) {
                if (thisNode.operator.getPriority() > highestPriority) {
                    highestPriority = thisNode.operator.getPriority();
                }
                thisNode = thisNode.nextNode;
            }
            thisNode = firstNode;
            while (thisNode.nextNode != null) {
                if (thisNode.operator.getPriority() == highestPriority) {
                    thisNode.simplifyAndCollapse();
                    if(thisNode == firstNode) {
                        firstNode = firstNode.nextNode;
                    }
                    break;
                }
                thisNode = thisNode.nextNode;
            }
        }while (firstNode.nextNode != null) ;
        firstNode.simplifyAndCollapse();
        return firstNode.lastNumber;
    }
}
