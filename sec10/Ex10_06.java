package sec10;

public class Ex10_06 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(num);

        num = 2; // 변수는 값 변경 가능
        System.out.println(num);

        final int ADDRESS = 123; // 상수 정의
        System.out.println(ADDRESS);

        // ADDRESS = 456; //상수는 값을 변경할 수 없음
        System.out.println(ADDRESS);
    }
}
