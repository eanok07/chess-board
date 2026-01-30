package chess.pieces;

import chess.*;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color, BoardPiece.queen);
    }

    @Override
    public boolean move(int sr, int sc, int er, int ec) {
        return true;
    }
}
