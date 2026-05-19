package sec06;
import java.util.Arrays;

public class Ex06_16 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        arr[1][0] = 10;
        arr[1][1] = 20;
        arr[1][2] = 30;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i])); // 다차원 배열 생성
        }
    }
}
