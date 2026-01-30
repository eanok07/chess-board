package chess;

public abstract class Piece {
    public final Color color;
    public final String name = this.getClass().getSimpleName();
    public boolean isCaptured;
    public boolean hasMoved;
    public Square currentSquare;



    public Piece(Color color) {
        this.color = color;

    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public abstract boolean move(Square targetSquare);
}
