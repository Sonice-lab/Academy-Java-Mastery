package sec06;
public class Ex06_21 {
    public static void main(String[] args) {
        int[] score = { 90, 92, 93 };

        int sum = 0;
        double avg = 0;

        // 향상된 for 문으로 리팯토링 해보는 실습

        // for(int i = 0; i < score.length;i++){
        // sum += score[i];
        // }

        for (int num : score) {

            sum += num;

        }

        avg = (double) sum / score.length;

        System.out.printf("총점: %d, 평균 %.2f", sum, avg);

    }
}
