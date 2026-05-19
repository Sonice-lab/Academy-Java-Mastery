package sec05.Practice;

public class P0503 {
    public static void main(String[] args) {
        int sum = 0;
        // int i = 1;
        // 1~100까지 짝수 구하기

        // for (int i = 1; i <= 100; i++) {
        // if (i % 2 == 0) {
        // sum += i;

        // continue로 해보기
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                continue;

            }

            sum += i;
        }

        System.out.println("짝수의 합:" + sum);
    }
}
