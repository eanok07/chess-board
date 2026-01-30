package chess.pieces;

import chess.*;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color, BoardPiece.bishop);
    }

    @Override
    public boolean move(int sr, int sc, int er, int ec) {
        return true;
    }
}
