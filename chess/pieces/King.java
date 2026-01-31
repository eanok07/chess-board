package chess.pieces;

import chess.*;

public class King extends Piece implements ForwardMoveStrategy, DiagonalMoveStrategy {

    public King(Color color, MoveStrategy moveStrategy) {
        super(color, moveStrategy);
    }
     public String getName() {
        return "King";
    }

   private boolean validMove(Square fromSquare, Square targetSquare) {
       int fromRow = fromSquare.getRow();
       int fromCol = fromSquare.getCol();
       
     
       return false;
    }
     @Override
    public boolean move(Square currentSquare, Square targetSquare) {
        return validMove(currentSquare, targetSquare);
    }
}   