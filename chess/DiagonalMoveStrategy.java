package chess;

public class DiagonalMoveStrategy implements MoveStrategy {
    @Override
    public int maxSteps() {
        return 8;
    }

    @Override
    public Square[] possibilities(Square currentSquare) {
        // Implementation for diagonal moves 
        int row = currentSquare.getRow();
        int col = currentSquare.getCol();
        Square[] possibilities = new Square[32];
        int index = 0;

        // Diagonal moves in four directions: up-left, up-right, down-left, down-right
        int[][] offsets = {{-1, -1}, {-1, 1}, {1, -1}, {1, 1}};
        
        

        return possibilities;
    }
    
}
