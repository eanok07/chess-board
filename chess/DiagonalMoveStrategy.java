package chess;

public interface DiagonalMoveStrategy {
    class DiagonalMoveStrategyBishops implements MoveStrategy {
    @Override
    public int maxSteps() {
        return 8;
    }
    
    @Override
    public boolean ValidMove(Square from, Square to) {
       
        return false;
    }

    @Override
    public Square[] possibilities(Square currentSquare) {
        // Implementation for diagonal moves 
        int row = currentSquare.getRow();
        int col = currentSquare.getCol();
        Square[] possibilities = new Square[32];
        int index = 0;

        int[][] offsets = {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        
        

        return possibilities;
    }
    
}


    
} 