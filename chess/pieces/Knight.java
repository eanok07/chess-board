package chess.pieces;
import chess.*;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color, BoardPiece.knight  );
    }

    @Override
    public boolean move(int startrow, int startcol, int endrow, int endcol) {
        return true;
    }
}
