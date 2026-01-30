package chess;

public class KingMoveStrategy  implements MoveStrategy {
    

    @Override
    public int maxSteps() {
        return 1;
    }

    @Override
    public Square[] possibilities(Square currentSquare) {
}
}
