package sec15;

public class Ex15_13 {
    public static void main(String[] args) {
        // Wrapper 클래스를 이용한 "문자형 > 숫자형" 변환
        String intStr = "70";

        System.out.println(intStr + intStr); // 7070 > 문자열이기 때문에

        int intStr1 = Integer.parseInt(intStr);
        System.out.println(intStr1 + intStr1);

        String doubleStr = "60.5";
        System.out.println(doubleStr + doubleStr);

        double doubleStr1 = Double.parseDouble(doubleStr);
        System.out.println(doubleStr1 + doubleStr1);
    }
}
