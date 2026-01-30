package chess;

public class QueenMoveStrategy implements MoveStrategy {
    private final ForwardMoveStrategy forwardMoveStrategy;
    private final DiagonalMoveStrategy diagonalMoveStrategy;

   

    @Override
    public int maxSteps() {
        return Math.max(forwardMoveStrategy.maxSteps(), diagonalMoveStrategy.maxSteps());
    }

    @Override
    public Square[] possibilities(Square currentSquare) {
        
        return Possibilities;
    }
    
}
