package chess;

public final class Square {
    private final int row;
    private final int col;
    private final Color color;

    public Square(int row, int col) {
        this.row = row;
        this.col = col;
        this.color = Square.determineColor(row, col);
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Color getColor() {
        return color;
    }

    public static Color determineColor(int row, int col) {
        return (row + col) % 2 == 0 ? Color.WHITE : Color.BLACK;
    }
}
