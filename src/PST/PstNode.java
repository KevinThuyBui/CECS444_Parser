package PST;

import Symbols.Symbol;
import Tokens.Token;

import java.util.Optional;

public abstract class PstNode {
    private Symbol symbol;

    public PstNode(Symbol symbol) {
        this.symbol = symbol;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    protected void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public abstract boolean isEpsilon();
}
