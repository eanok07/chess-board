package chess.pieces;

import chess.*;

public class Rook extends Piece {

    public Rook(Color color) {
        super(color, BoardPiece.rook);
    }

    @Override
    public boolean move(int startrow, int startcol, int endrow, int endcol) {
        return true;
    }
}
