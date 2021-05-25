package day33_multidimentional_aarays;

import java.util.Arrays;

public class Chessboard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];


        for (int k = 0; k < chessBoard.length; k++) {
            if (k > chessBoard.length );
            char c = 'a';
            for (int j = 0; j < chessBoard.length; j++) {

                chessBoard[k][j] = "" + (k + 1) + c;
                c++;

            }
            System.out.println(Arrays.deepToString(chessBoard[k]));
        } System.out.println(Arrays.deepToString(chessBoard));
    }
}
