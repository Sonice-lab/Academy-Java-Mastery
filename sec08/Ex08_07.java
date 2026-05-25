package sec08;

class MidTerm {
    int score(int[] scores) {
        int result = 0;

        for (int score : scores) {
            result += score;// 합산
        }

        return result;// 반환
    }
}

public class Ex08_07 {
    public static void main(String[] args) {
        int[] studentA = { 97, 87 };
        int[] studentB = { 96, 86 };

        MidTerm midTerm = new MidTerm();
        int sumA = midTerm.score(studentA);
        int sumB = midTerm.score(studentB);

        if (sumA > sumB) {
            System.out.println("A학생이 총점이 더 높음");
        } else if (sumA < sumB) {
            System.out.println("B학생이 총점이 더 높음");
        } else {
            System.out.println("총점이 같음");
        }
    }
}
