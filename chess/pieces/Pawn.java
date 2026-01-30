package chess.pieces;
import chess.*;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean move(Square targetSquare) {
        return true;
    }
}
