package PST;

import Symbols.Symbol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PstInnerNode extends PstNode {
    private ArrayList<PstNode> children;
    private int rule;

    public PstInnerNode(Symbol symbol, int ruleID) {
        super(symbol);
        this.rule = ruleID;
        children = new ArrayList<>();
    }

    public PstInnerNode(Symbol symbol) {
        this(symbol, 0);
    }

    public boolean isEpsilon() {
        return getChildCount() == 0;
    }

    public void addChild(PstNode child) {
        children.add(child);
    }

    public int getChildCount() {
        return children.size();
    }

    public PstNode getChild(int id) {
        return children.get(id);
    }

    public void removeChild(PstNode child) {
        children.remove(child);
    }

    public void removeChild(int id) {
        children.remove(id);
    }

    public void removeAllChildren() {
        children = new ArrayList<>();
    }

    public void setRule(int id) {
        rule = id;
    }


    public int getRuleId() {
        return rule;
    }
    public List<PstNode> getChildren() {
        return children;
    }

    public void copyFrom(PstNode sourceNode) {
        setSymbol(sourceNode.getSymbol());
        if (sourceNode instanceof PstInnerNode) {
            setRule(((PstInnerNode) sourceNode).getRuleId());
        }
        //TODO potentially copy other stuff that isn't implemented yet
    }

    public void replaceChild(PstInnerNode oldChild, PstLeafNode newChild) {
        Collections.replaceAll(children, oldChild, newChild);
    }

    @Override
    public String toString() {
        return "PstInnerNode{" +
                "symbol=" + getSymbol() +
                ", children=" + children +
                ", rule=" + rule +
                '}';
    }
}
