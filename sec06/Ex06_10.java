package sec06;
import java.util.Arrays;

public class Ex06_10 {
    public static void main(String[] args) {
        int[] arr01 = { 1, 2, 3 };
        int[] arr02 = arr01; // 참조할당(배열 주소 할당), 얕은 복사x

        System.out.println(Arrays.toString(arr01));
        System.out.println(Arrays.toString(arr02));

        arr02[0] = 0;

        System.out.println(Arrays.toString(arr01));
        System.out.println(Arrays.toString(arr02));

        System.out.println(arr01); // [I@1dbd16a6
        System.out.println(arr02); // [I@1dbd16a6

    }
}
