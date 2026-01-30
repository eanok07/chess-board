package chess.pieces;

import chess.*;

public class Bishop extends Piece {

    public Bishop(Color color) {
        super(color, BoardPiece.bishop);
    }

    @Override
    public boolean move(int startrow, int startcol, int endrow, int endcol) {
        return true;
    }
}
