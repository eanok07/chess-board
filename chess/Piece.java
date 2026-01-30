package chess;

public abstract class Piece {
    public  Color color;
    public BoardPiece piece;
    
    public enum Color  {
    white,
    black
}
public enum BoardPiece {
    pawn, rook, knight, bishop, queen, king
}


    public Piece(Color color, BoardPiece piece) {
        this.color = color;
        this.piece = piece;
    }

    public Color getColor() {
        return color;
    }

    public BoardPiece getType() {
        return piece;
    }

    public abstract boolean move(int startRow, int startCol, int endRow, int endCol);
}
