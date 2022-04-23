package u.pankratova.ch9.chess;

import java.util.ArrayList;

public class Rook extends ChessPiece {

    public Rook(String coordinates) {
        column = (coordinates.substring(0, 1));
        row = (coordinates.substring(1, 2));
    }


    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> move = new ArrayList<>();

        for (int i = convertColumnToInt(column) + 1; i <= 8; i++) {
                move.add(convertColumnToString(i) + getRow());
        }

        for (int i = convertColumnToInt(column) - 1; i > 0; i--) {
                move.add(convertColumnToString(i) + getRow());
        }

        for (int i = convertColumnToInt(column) + 1; i <= 8; i++){
            if (i != convertRowToInt(getRow())) {
                move.add(getColumn() + (i));
            }
        }

        for (int i = convertColumnToInt(column); i > 0; i--){
            if (i != convertRowToInt(getRow())) {
                move.add(getColumn() + (i));
        }}

        return move;
    }
}
