package chess.pieces;
import chess.*;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color, BoardPiece.pawn);
    }

    @Override
    public boolean move(int startrow, int startcol, int endrow, int endcol) {

        return true;
    }
}
