package u.pankratova.ch9.chess;

import java.util.ArrayList;

public class Bishop extends ChessPiece {

    public Bishop(String coordinates) {
        column = coordinates.substring(0, 1);
        row = coordinates.substring(1, 2);
    }


    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> move = new ArrayList<>();

        int iColumn = convertColumnToInt(getColumn());
        int iRow = convertRowToInt(getRow());
        final int iColumnFinal = iColumn;
        final int iRowFinal = iRow;


        while (iColumn + 1 <= 8 && iRow < 8) {
            move.add(convertColumnToString(iColumn + 1) + (iRow + 1));
            iColumn++;
            iRow++;
        }

        iColumn = iColumnFinal;
        iRow = iRowFinal;

        while (iColumn - 1 >= 1 && iRow > 1) {
            move.add(convertColumnToString(iColumn - 1) + (iRow - 1));
            iColumn--;
            iRow--;
        }

        iColumn = iColumnFinal;
        iRow = iRowFinal;

        while (iColumn < 8 && iRow - 1 > 0) {
            move.add(convertColumnToString(iColumn + 1) + (iRow - 1));
            iColumn++;
            iRow--;
        }

        iColumn = iColumnFinal;
        iRow = iRowFinal;

        while (iColumn > 1  && iRow < 8) {
            move.add(convertColumnToString(iColumn - 1) + (iRow + 1));
            iColumn--;
            iRow++;
        }

        return move;
    }
}

