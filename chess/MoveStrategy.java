package chess;

public interface MoveStrategy {
    public int maxSteps();
    public Square[] possibilities(Square currentSquare);
    
}
