package sec04.Practice;

public class P0402 {
    public static void main(String[] args) {
        int score = 77;
        char result = 'A';

        if(score >=70){
            result = 'C';

        } else if (score >= 60) {
            result = 'D';

        }

        System.out.println(score + "점의 학점은" + result + "입니다.");
    }
}
