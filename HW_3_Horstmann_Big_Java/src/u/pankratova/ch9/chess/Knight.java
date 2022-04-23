package u.pankratova.ch9.chess;

import java.util.ArrayList;

public class Knight extends ChessPiece{

    public Knight(String coordinates) {
        column = coordinates.substring(0, 1);
        row = coordinates.substring(1, 2);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> move = new ArrayList<>();

        int iColumn = convertColumnToInt(getColumn());
        int iRow = convertRowToInt(getRow());

        move.add(convertColumnToString((iColumn + 2)) + (iRow + 1));
        move.add(convertColumnToString((iColumn + 2)) + (iRow - 1));
        move.add(convertColumnToString((iColumn - 2)) + (iRow - 1));
        move.add(convertColumnToString((iColumn - 2)) + (iRow + 1));

        move.add(convertColumnToString((iColumn + 1)) + (iRow + 2));
        move.add(convertColumnToString((iColumn - 1)) + (iRow + 2));

        move.add(convertColumnToString((iColumn - 1)) + (iRow - 2));
        move.add(convertColumnToString((iColumn + 1)) + (iRow - 2));

        return move;
    }
}
