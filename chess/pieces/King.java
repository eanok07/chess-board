package chess.pieces;

import chess.*;

public class King extends Piece {

    public King(Color color) {
        super(color, BoardPiece.king);
    }

    @Override
    public boolean move(int sr, int sc, int er, int ec) {
        return true;
    }
}
