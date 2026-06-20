package sec17.practice;

import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {

        // 부동 소수점 오차 해결 방법
        double sumDouble = 0.1 + 0.1 + 0.1;
        System.out.println(sumDouble); // 0.30000000000000004

        BigDecimal num1 = new BigDecimal("0.1");
        BigDecimal num2 = new BigDecimal("0.1");
        BigDecimal num3 = new BigDecimal("0.1");

        BigDecimal result = num1.add(num2).add(num3); // 메서드 체이닝 적용
        System.out.println(result); // 0.3
        System.out.println(result.doubleValue()); // 0.3

        System.out.println("---");
        System.out.println(new BigDecimal("0.1").add(new BigDecimal("0.1")).add(new BigDecimal("0.1"))); // 0.3

    }
}
