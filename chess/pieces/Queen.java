package chess.pieces;

import chess.*;

public class Queen extends Piece implements ForwardMoveStrategy, DiagonalMoveStrategy {

    public Queen(Color color, MoveStrategy moveStrategy) {
        super(color, moveStrategy);
    }
    public String getName() {
        return "Queen";
    }
    public boolean ValidMove(Square fromSquare, Square targetSquare) {
       int fromRow = fromSquare.getRow();
       int fromCol = fromSquare.getCol();
       
       return false;
    }

    @Override
    public boolean move(Square currentSquare, Square targetSquare) {
        return ValidMove(currentSquare, targetSquare);
    }
}
