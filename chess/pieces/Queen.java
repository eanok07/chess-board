package chess.pieces;

import chess.*;

public class Queen extends Piece {

    public Queen(Color color) {
        super(color, BoardPiece.queen);
    }

    @Override
    public boolean move(int startrow, int startcol, int endrow, int endcol) {
        return true;
    }
}
