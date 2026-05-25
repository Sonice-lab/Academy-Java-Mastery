package sec06.Practice;

import java.util.Arrays;

public class Pmabang {
    public static void main(String[] args) {
        int nextRow = 0;
        int nextCol = 2;
        int[][] mabang = new int[5][5];
        int count = 1;
        mabang[nextRow][nextCol] = count++;
        while (count <= 25) {
            nextRow--;
            nextCol++;
            if (nextRow < 0 && nextCol < 5) {
                nextRow = 4;
            }
            if (nextRow >= 0 && nextCol == 5) {
                nextCol = 0;
            }

            if (nextCol > 4 && nextRow < 0) {
                nextRow += 2;
                nextCol--;

            }

            if (mabang[nextRow][nextCol] != 0) {
                nextRow += 2;
                nextCol--;

            }

            mabang[nextRow][nextCol] = count++;

        }

        for (int[] row : mabang) {
            System.out.println(Arrays.toString(row));
        }

    }
}
