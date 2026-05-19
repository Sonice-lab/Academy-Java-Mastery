package sec06.Practice;

import java.util.Arrays;

public class P0604 {
    public static void main(String[] args) {
        int nextRow = 0;
        int nextCol = 2;
        int[][] mabang = new int[5][5];
        // mabang[4][3] = 2;

        int count = 1;

        mabang[nextRow][nextCol] = count++;

        while (count <= 25) {
            nextRow--;
            nextCol++;

            if (nextRow < 0 && nextCol == 5) {
                nextRow += 2;
                nextCol--;
            }
            // mabang[nextRow][nextCol] = count++;

            else if (nextRow < 0) {
                nextRow = 4;
            }
            else if (nextCol == 5) {
                nextCol = 0;
            }
            // mabang[nextRow][nextCol] = count++;
            else if (mabang[nextRow][nextCol] != 0) {
                nextRow += 2;
                nextCol--;
            }
            mabang[nextRow][nextCol] = count++;
        }

        // if (nextRow < 0 && nextCol == 5)
        ;
        // nextCol = 5;

        // mabang[nextRow][nextCol] = count++;

        // {

        // if (nextRow < 0 && nextCol == 5)
        ;
        // nextCol = 5;

        // mabang[nextRow][nextCol] = count++;

        // }

        for (int[] row : mabang) {

            System.out.println(Arrays.toString(row));
        }
    }
}
