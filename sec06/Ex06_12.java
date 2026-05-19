package sec06;
import java.util.Arrays;

public class Ex06_12 {
    public static void main(String[] args) {
        // 배열의 얕은 복사
        // for문을 이용한 얕은 복사
        // arrays.copyfo
        // System.arraycopy
        // 위의 3가지 복사는 얕은 복사의 개념 > 컴퓨터의 한정적인 자원을 효율적으로 활용하기 위함
        int[][] arr01 = { { 1, 2 }, { 3, 4 } };
        int[][] arr02 = new int[arr01.length][arr01[0].length];
        // int[][] arr02 = Arrays.copyOf(arr01, arr01.length);

        // 배열의 복사 참조 할당 > 같은 곳을 바라본다고 비유가 가능
        for (int i = 0; i < arr01.length; i++) {
            arr02[i] = arr01[i];

        }
        System.arraycopy(arr01, 0, arr02, 0, arr01.length);
        System.out.println(arr01); // [I@1dbd16a6
        System.out.println(arr02); // [I@7ad041f3

        // 배열의 복사
        // for (int i = 0; i < arr01.length; i++) {
        // arr02[i] = arr01[i]; // 복사 기능을 쓰더라도 참조 할당이 됨 > 얕은 복사
        // }

        System.out.println(arr01); // [I@1dbd16a6
        System.out.println(arr02); // [I@7ad041f3

        arr02[0][0] = 0;

        System.out.println(arr01[0]); // [I@1dbd16a6
        System.out.println(arr02[0]); // [I@7ad041f3

    }
}
