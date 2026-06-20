package sec17;

interface CompareNumber {
    int compareTo(int num01, int num02);
}

public class CompareMain {
    public static void main(String[] args) {
        // 익명클래스로 compare 객체 생성
        // CompareNumber compare = new CompareNumber() {
        // @Override
        // public int compareTo(int num01, int num02) {
        // return num01 > num02 ? 1 : num01 < num02 ? -1 : 0;
        // }
        // };

        // 람다식으로 변경(적용)
        CompareNumber compare = (num01, num02) ->

        num01 > num02 ? 1 : num01 < num02 ? -1 : 0;

        int num01 = 10;
        int num02 = 20;

        int result = compare.compareTo(num01, num02);

        System.out.println(result); // -1

        if (result > 0) {
            System.out.println("num01이 더 큽니다.");
        } else if (result < 0) {
            System.out.println("num02가 더 큽니다.");
        } else {
            System.out.println("num01과 num02가 같습니다.");
        }

    }
}
