package sec04;

import java.util.Scanner;

public class Ex04_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요.: ");

        int age = scanner.nextInt();

        if (age > 19)   {
            System.out.println("성인입니다!");

        } else{
            System.out.println("미성년자입니다!");
        }



        scanner.close();
        
    }
}
