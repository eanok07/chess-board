package chess.pieces;

import chess.*;

public class King extends Piece {

    public King(Color color) {
        super(color);
    }

    @Override
    public boolean move(Square targetSquare) {
        return true;
    }
}
