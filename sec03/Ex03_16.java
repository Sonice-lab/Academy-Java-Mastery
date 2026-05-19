package sec03;

public class Ex03_16 {
    public static void main(String[] args) {
        int num = 2 < 1 ? 2 : 1; //노란색 2는 데드 코드로 평가됨

        System.out.println(num);
    }
}
