package u.pankratova.ch9.chess;

import java.util.ArrayList;

public class Pawn extends ChessPiece {

    public Pawn(String coordinates) {
        column = coordinates.substring(0, 1);
        row = coordinates.substring(1, 2);
    }


    @Override
    public ArrayList<String> canMoveTo() {
        ArrayList<String> move = new ArrayList<>();

        if (convertRowToInt(getRow()) == 2) {
            move.add(column + (convertRowToInt(getRow()) + 1));
            move.add(column + (convertRowToInt(getRow()) + 2));
        }

        if (convertRowToInt(getRow()) >= 3 && convertRowToInt(getRow()) <= 6) {
            move.add(column + (convertRowToInt(getRow()) + 1));
        }

        if (convertRowToInt(getRow()) == 7) {
            move.add(column + (convertRowToInt(getRow()) + 1));
            move.add(" --> choose any chess piece");
        }

        if (convertRowToInt(getRow()) < 2 || convertRowToInt(getRow()) > 7){
            move.add("Error");
        }
        return move;
    }
}
