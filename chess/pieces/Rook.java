package chess.pieces;

import chess.*;

public class Rook extends Piece {

    public Rook(Color color) {
        super(color);
    }

    @Override
    public boolean move(Square targetSquare) {
        return true;
    }
}
