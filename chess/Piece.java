package chess;

public abstract class Piece {
    public final Color color;
    public final String name = this.getClass().getSimpleName();
    public boolean isCaptured;
    public boolean hasMoved;
    public Square currentSquare;
    protected MoveStrategy moveStrategy;



    public Piece(Color color, MoveStrategy moveStrategy) {
        this.color = color;
        this.moveStrategy = moveStrategy;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public boolean move(Square currentSquare, Square targetSquare) {
        
        return false;
    }


}


