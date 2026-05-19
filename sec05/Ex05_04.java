package sec05;

public class Ex05_04 {
    public static void main(String[] args) {
        // 1에서 100까지 총합

        int result = 0;
        
        for(int i = 1; i <= 100; i++) {
            //result = result + i; 의 코딩은 아래와 같음
            if ( i % 2 == 0) {
                result += i;
            }
        }
        

        System.out.println("1~100 중 짝수 총합" + result);


    }
}
