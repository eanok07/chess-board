package chess;

public class ForwardMoveStrategy implements MoveStrategy {
    @Override
    public int maxSteps() {
        return 8;
    }

    @Override
    public Square[] possibilities(Square currentSquare) {
        // Implementation for forward moves
        int row = currentSquare.getRow();
        int col = currentSquare.getCol();
        Square[] possibilities = new Square[8];
        int index = 0;

        
        return possibilities;
    }
    
}
