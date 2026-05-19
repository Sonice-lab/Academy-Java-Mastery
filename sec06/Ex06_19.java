package sec06;
import java.util.Scanner;

public class Ex06_19 {
    public static void main(String[] args) {

        // 이퀄스 메서드는 참조 자료형의 값을 비교할 때 사용하는 메서드임
        // 객체 비교가 아닌 값 비교를 의미함 참조자료형은 힙메모리의 주소를 가지고 있기 때문에 잘 따져야함
        // 기본 참고형은 값이기 때문에 신경쓰지 않아도 괜찮음
        // call by value, call by reference 차이

        int[][] lotto = {
                { 1, 2, 3, 4, 5, 6 },
                { 11, 12, 13, 14, 15, 16 } };

        Scanner scanner = new Scanner(System.in);
        System.out.print("당첨 숫자 6개를 연속으로 입력해주세요. >>");
        String myNum = scanner.next();

        boolean isWin = false;

        for (int i = 0; i < lotto.length; i++) {
            String lottoNum = "";

            for (int j = 0; j < lotto[i].length; j++) {
                lottoNum += lotto[i][j];

            }

            if (myNum.equals(lottoNum)) {
                isWin = !isWin;
                break;
            }
        }

        if (isWin) {
            System.out.printf("[%s] 번호 당첨!!!%n", myNum);
        } else {

            System.out.printf("[%s] 번호 당첨되지 못했습니다!!!%n", myNum);

        }

        scanner.close();

    }
}
