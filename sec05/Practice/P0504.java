package sec05.Practice;

public class P0504 {
    public static void main(String[] args) {
        // 두 개의 주사위 같은 값일 경우 반복 횟수, 눈의 번호 출력하기
        int count = 0;
        int dice1, dice2;
        while (true) {
            count++;
            dice1 = (int) (Math.random() * 6) + 1;
            System.out.println(dice1);

            dice2 = (int) (Math.random() * 6) + 1;
            System.out.println(dice2);

            if (dice1 == dice2) {
                break;
            }
        }

        System.out.printf("반복 횟수: %d, 눈의 번호: %d, count, dice1");
    }
}
