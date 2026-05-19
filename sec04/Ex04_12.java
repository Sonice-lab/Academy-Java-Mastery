package sec04;

import java.util.Scanner;

public class Ex04_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("과일은?");

        String fruit = scanner.next();

        System.out.println(fruit);

        // 스위치 표현식(Switch Expression)
        int price = switch (fruit) { 
            case "사과", "망고" -> 2000;
            //case "망고" -> 2000;      
            case "바나나" -> 3000;
            default -> 0;
        };

        System.out.printf("%s의 가격: %d원", fruit, price);

        scanner.close();

    }
}
