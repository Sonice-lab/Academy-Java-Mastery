package sec06;

import java.util.Arrays;

public class Ex06_07 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 4, 1 };
        // swap 알고리즘

        int temp = 0;// 배열의 숫자들이 전부 0보다 크기 때문에 0으로 지정
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < arr.length - 1; j++) { // 4번만 반복이기에 -1을 해준다.
                if (arr[j] > arr[j + 1]) { // +1은 다음 배열을 의미
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }

            }

            // System.out.println(Arrays.toString(arr));

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
