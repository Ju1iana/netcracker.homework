package u.pankratova.ch9.chess;

import java.util.ArrayList;

public class Queen extends ChessPiece{

    public Queen(String coordinates) {
        column = coordinates.substring(0, 1);
        row = coordinates.substring(1, 2);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> move = new ArrayList();

        Bishop bishop = new Bishop(getColumn() + getRow());
        Rook rook = new Rook(getColumn() + getRow());

        move.addAll(bishop.canMoveTo());
        move.addAll(rook.canMoveTo());

        return move;
    }
}
