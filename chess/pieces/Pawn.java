package chess.pieces;
import chess.*;

public class Pawn extends Piece implements ForwardMoveStrategy {
    public Pawn(Color color, MoveStrategy moveStrategy) {
        super(color, moveStrategy);
    }
    public String getName() {
        return "Pawn";
    }
     @Override
    public boolean move (Square targetSquare, Square fromSquare) {
        return false;
    }

    private boolean validMove(Square fromSquare, Square targetSquare) {
       int fromRow = fromSquare.getRow();
       int fromCol = fromSquare.getCol();
         return false;
     }



}
