package sec04;

import java.util.Scanner;

public class Ex04_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자는?");
        int number = scanner.nextInt();

       // System.out.println(number %2); //결과가 1이면 홀수, 결과가 0이면 짝수

       if(number %2==0){
        System.out.println("짝수입니다!");
       } else{
        System.out.println("홀수입니다!");
       }

        scanner.close();


    }
}
