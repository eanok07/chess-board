package chess.pieces;

import chess.*;

public class Rook extends Piece implements ForwardMoveStrategy {

    public Rook(Color color, MoveStrategy moveStrategy) {
        super(color, moveStrategy);
    }

    public String getName() {
        return "Rook";
    }
    @Override
    public boolean move(Square fromSquare, Square targetSquare) {
        return validMove(fromSquare, targetSquare);
    }
    private boolean validMove(Square fromSquare, Square targetSquare) {
       int fromRow = fromSquare.getRow();
       int fromCol = fromSquare.getCol();
       
       return false;
    }
}
