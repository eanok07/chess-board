package chess.pieces;
import chess.*;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color);
    }

    @Override
    public boolean move(Square targetSquare) {
        return true;
    }
}
