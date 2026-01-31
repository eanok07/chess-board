package chess;

public interface MoveStrategy {
    public int maxSteps();
    public Square[] possibilities(Square currentSquare);
    public boolean ValidMove(Square currentSquare, Square targetSquare);
  
}
