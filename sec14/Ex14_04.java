package sec14;

public class Ex14_04 {
    public static void main(String[] args) {

        try {
            int result = 0;

            result = 10 / 0;
            System.out.println("나누기 결과: " + result); // ArithmeticException > try - catch

            // } catch (ArithmeticException e) { // ArithmeticException
            // ArithmeticException의 부모 클래스(RuntimeException)이므로 캐치 가능
        } catch (RuntimeException e) {
            System.out.println("0으로는 나눌 수 없습니다.");
        }
    }
}
