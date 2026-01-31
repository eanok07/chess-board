package chess;

public interface QueenMoveStrategy {

     class QueenMoveStrategyall implements MoveStrategy {
    @Override
    public int maxSteps() {
        return 8;
    }

    @Override
    public Square[] possibilities(Square currentSquare) {
        // Implementation for all moves
        int row = currentSquare.getRow();
        int col = currentSquare.getCol();
        Square[] possibilities = new Square[64];
        int index = 0;

        
        return possibilities;
    }

    @Override
    public boolean ValidMove(Square from, Square to) {
        return false;
    }
   
    
}

}
