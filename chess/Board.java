package chess;

public class Board {
    private Square[][] squares = new Square[8][8];;

    public Board() {
        // Initialize board here
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                squares[row][col] = new Square(row, col);
            }
        }   
    }
}