package sec03;

public class Ex03_10 {
    public static void main(String[] args) {
        int result = 100*100;
        System.out.println(result);
        result = 100000*100000; //int 가 표현할 수 있는 값의 범위를 초과함
        System.out.println(result); //쓰레기값(오류가 발생하지 않았던 점이 문제)
    }
}
