package sec05;

public class Ex05_07 {
    public static void main(String[] args) {
        // 중첩 for 문
        // 구구단
        for(int i = 1; i < 10; i++){
            for(int j = 2;j<10;j++){
            System.out.printf("%d❌%d = %d\t",j, i, i*j);
            }
            System.out.println(); //단별로 줄바꿈
        }
    }
}
