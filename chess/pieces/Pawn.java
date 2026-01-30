package chess.pieces;
import chess.*;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color, BoardPiece.pawn);
    }

    @Override
    public boolean move(int starr, int sc, int er, int ec) {

        return true;
    }
}
