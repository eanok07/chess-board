package chess.pieces;

import chess.*;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color);
    }

    @Override
    public boolean move(Square targetSquare) {
        return true;
    }
}