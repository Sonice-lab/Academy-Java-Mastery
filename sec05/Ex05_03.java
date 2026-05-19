package sec05;

public class Ex05_03 {
    public static void main(String[] args) {
        // 1에서 5까지숫자의 합계 계산하기
        // System.out.println("1~5 총합" + (1+2+3+4+5));

        int result = 0;
        
        for(int i = 1;i<=5;i++){
            //result = result + i;
            result += i;

        }

        System.out.println("1~5 총합" + result);
        
    }
}
