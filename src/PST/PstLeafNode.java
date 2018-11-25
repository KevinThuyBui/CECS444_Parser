package PST;

import Symbols.Symbol;
import Tokens.Token;

public class PstLeafNode extends PstNode {
    private Token token;

    public PstLeafNode(Symbol symbol, Token token) {
        super(symbol);
        this.token = token;
    }

    public boolean isEpsilon() {
        return false;
    }

    public Token getToken() {
        return token;
    }

    @Override
    public String toString() {
        return "PstLeafNode{" +
                "symbol = " + getSymbol() +
                ", token=" + getToken() +
                '}';
    }
}
