package sec06;

import java.util.Arrays;
import java.util.Comparator;

public class Ex06_09 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 4, 1 };

        Arrays.sort(arr); // 오름차순 정렬 명령어

        System.out.println(Arrays.toString(arr));

        Integer[] arrInteger = { 3, 2, 5, 4, 1 };

        Arrays.sort(arrInteger, Comparator.reverseOrder()); // 내림차순 정렬

        System.out.println(Arrays.toString(arrInteger));
    }
}
