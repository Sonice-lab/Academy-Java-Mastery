package sec06;
import java.util.Arrays;

public class Ex06_17 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;
        arr[0][4] = 5;

        arr[1][0] = 6;
        arr[1][1] = 7;
        arr[1][2] = 8;
        arr[1][3] = 9;
        arr[1][4] = 10;

        arr[2][0] = 11;
        arr[2][1] = 12;
        arr[2][2] = 13;
        arr[2][3] = 14;
        arr[2][4] = 15;

        arr[3][0] = 16;
        arr[3][1] = 17;
        arr[3][2] = 18;
        arr[3][3] = 19;
        arr[3][4] = 20;

        arr[4][0] = 21;
        arr[4][1] = 22;
        arr[4][2] = 23;
        arr[4][3] = 24;
        arr[4][4] = 25;
        
        
        int count = 1;


        for(int i = 0; i<5;i++){
            for(int j = 0;j<5;j++){
                arr[i][j] = count++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));

        }
    }
}
