package u.pankratova.ch9.chess;

import java.util.ArrayList;

public class ChessPiece {

    protected String column;
    protected String row;

    public ArrayList<String> canMoveTo() {
        return new ArrayList<>();
    }

    public String getColumn() {
        return column;
    }

    public String getRow() {
        return row;
    }

    public int convertColumnToInt(String column) {
        int result = 0;

        switch (column) {

            case "a":
                result = 1;
                break;
            case "b":
                result = 2;
                break;
            case "c":
                result = 3;
                break;
            case "d":
                result = 4;
                break;
            case "e":
                result = 5;
                break;
            case "f":
                result = 6;
                break;
            case "g":
                result = 7;
                break;
            case "h":
                result = 8;
                break;
        }
        return result;
    }


    public int convertRowToInt(String s) {
        int line = Integer.parseInt(getRow());
        return line;
    }


    public String convertColumnToString(int i) {
        String result = "nothing";
        switch (i) {
            case 1:
                result = "a";
                break;
            case 2:
                result = "b";
                break;
            case 3:
                result = "c";
                break;
            case 4:
                result = "d";
                break;
            case 5:
                result = "e";
                break;
            case 6:
                result = "f";
                break;
            case 7:
                result = "g";
                break;
            case 8:
                result = "h";
                break;
        }
        return result;
    }
}

/* test

*----------------- Pawn -----------------*
The pawn moves to: [d3, d4]
The pawn moves to: [a6]
The pawn moves to: [f8,  --> choose any chess piece]
The pawn moves to: [Error]

*----------------- Rook -----------------*
Rook: [b5, c5, d5, e5, f5, g5, h5, a2, a3, a4, a6, a7, a8, a1]
Rook: [h8, f8, e8, d8, c8, b8, a8, g7, g6, g5, g4, g3, g2, g1]
Rook: [e3, f3, g3, h3, c3, b3, a3, d5, d6, d7, d8, d4, d2, d1]
Rook: [g1, h1, e1, d1, c1, b1, a1, f7, f8, f6, f5, f4, f3, f2]

*----------------- King -----------------*
King: [d5, d3, e4, c4, e5, c5, e3, c3]
King1: [b7, b5, c6, a6, c7, a7, c5, a5]

*----------------- Bishop -----------------*
Bishop: [g6, h7, e4, d3, c2, b1, g4, h3, e6, d7, c8]
Bishop1: [c8, a6, c6, d5, e4, f3, g2, h1, a8]
Bishop2: [g7, f6, e5, d4, c3, b2, a1]

*----------------- Queen -----------------*
Queen: [f4, g5, h6, d2, c1, f2, g1, d4, c5, b6, a7, f3, g3, h3, d3, c3, b3, a3, e6, e7, e8, e5, e4, e2, e1]
Queen1: [f7, e6, d5, c4, b3, a2, h7, h8, f8, e8, d8, c8, b8, a8, g7, g6, g5, g4, g3, g2, g1]

*----------------- Knight -----------------*
Knight: [f5, f3, b3, b5, e6, c6, c2, e2]
Knight1: [e7, e5, a5, a7, d8, b8, b4, d4]

*/

