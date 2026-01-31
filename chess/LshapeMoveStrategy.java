package chess;

public  interface LshapeMoveStrategy {
     class LshapeMoveStrategyKnight  implements MoveStrategy {
    @Override
    public int maxSteps() {
        return 8;
    }

    @Override
    public Square[] possibilities(Square currentSquare) {
        // Implementation for L-shaped moves (knight moves)
        int row = currentSquare.getRow();
        int col = currentSquare.getCol();
        Square[] possibilities = new Square[8];
        int index = 0;

        int[][] offsets = {};
        
      
        return possibilities;
    }

    @Override
    public boolean ValidMove(Square from, Square to) {
       
        return false;
    }
}

    
}
