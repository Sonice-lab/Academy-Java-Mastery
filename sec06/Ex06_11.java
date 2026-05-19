package sec06;
import java.util.Arrays;

public class Ex06_11 {
    public static void main(String[] args) {
        int[] arr01 = { 1, 2, 3 };
        int[] arr02 = new int[arr01.length];
            // 배열의 복사
        for(int i = 0;i < arr01.length;i++){
            arr02[i] = arr01[i];
            
        }

        System.out.println(Arrays.toString(arr01));
        System.out.println(Arrays.toString(arr02));

        arr02[0] = 0;

        System.out.println(Arrays.toString(arr01)); //같은 곳을 참조하지 않음
        System.out.println(Arrays.toString(arr02));

        System.out.println(arr01); // [I@1dbd16a6
        System.out.println(arr02); // [I@7ad041f3

    }
}
