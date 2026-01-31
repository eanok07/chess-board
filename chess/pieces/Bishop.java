package chess.pieces;

import chess.*;

public class Bishop extends Piece implements DiagonalMoveStrategy {
    public Bishop(Color color, MoveStrategy moveStrategy) {
        super(color, moveStrategy);
    }
    public String getName() {
        return "Bishop";
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