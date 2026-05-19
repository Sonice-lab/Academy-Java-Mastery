package sec06;
import java.util.Arrays;

public class Ex06_14 {
    public static void main(String[] args) {
        int[] arr01 = { 1, 2, 3 };
        int[] arr02 = new int[arr01.length];

        System.arraycopy(arr01, 0, arr02, 0, arr01.length); //얕은 복사
        // 배열의 복사 얕은 복사(copyof를 이용)

        System.out.println((arr01));
        System.out.println((arr02));

        arr02[0] = 0;

        System.out.println(Arrays.toString(arr01)); // 같은 곳을 참조하지 않음
        System.out.println(Arrays.toString(arr02));

        System.out.println(arr01);
        System.out.println(arr02);
    }
}
