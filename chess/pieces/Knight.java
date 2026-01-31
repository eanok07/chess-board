package chess.pieces;
import chess.*;

public class Knight extends Piece implements LshapeMoveStrategy {
    public Knight(Color color, MoveStrategy moveStrategy) {
        super(color, moveStrategy);
    }
    public String getName() {
        return "Knight";
    }

    @Override
    public boolean move(Square fromSquare, Square targetSquare) {
        return false;   
    }
     private boolean validMove(Square fromSquare, Square targetSquare) {
       int fromRow = fromSquare.getRow();
       int fromCol = fromSquare.getCol();
         return false;
     }

   
}
