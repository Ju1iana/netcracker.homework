package u.pankratova.ch9.chess;

import java.util.ArrayList;

public class King extends ChessPiece {

    public King(String coordinates) {
        column = coordinates.substring(0, 1);
        row = coordinates.substring(1, 2);
    }

    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList move = new ArrayList();

        int temp = convertColumnToInt(getColumn());

        move.add(column + (convertRowToInt(getRow()) + 1));
        move.add(column + (convertRowToInt(getRow()) - 1));

        move.add((convertColumnToString(temp + 1)) + row);
        move.add((convertColumnToString(temp - 1)) + row);

        move.add((convertColumnToString(temp + 1)) + (convertRowToInt(getRow()) + 1));
        move.add((convertColumnToString(temp - 1)) + (convertRowToInt(getRow()) + 1));


        move.add((convertColumnToString(temp + 1)) + (convertRowToInt(getRow()) - 1));
        move.add((convertColumnToString(temp - 1 ))+ (convertRowToInt(getRow()) - 1));

        return move;
    }
}
