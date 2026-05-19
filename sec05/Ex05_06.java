package sec05;

public class Ex05_06 {
    public static void main(String[] args) {
        // 중첩 for 문
        // 구구단
        for(int i = 2; i < 10; i++){
            for(int j = 1;j<10;j++){
            System.out.printf("%d❌%d = %d\t",i, j, i*j);
            }
            System.out.println(); //단별로 줄바꿈
        }
    }
}
