package sec06;
import java.util.Arrays;

public class Ex06_15 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        System.out.println(Arrays.toString(arr));// null > 참고타입, 배열이라는 뜻
        // 배열의 크기 초기화, 다차원의 배열을 만들 수 있음
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[1];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
