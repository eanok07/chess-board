package chess;

public class LshapeMoveStrategy implements MoveStrategy {
    @Override
    public int maxSteps() {
        return 1;
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
}