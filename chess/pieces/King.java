package chess.pieces;

import chess.*;

public class King extends Piece {

    public King(Color color) {
        super(color, BoardPiece.king);
    }

    @Override
    public boolean move(int startrow, int startcol, int endrow, int endcol) {
        return true;
    }
}
