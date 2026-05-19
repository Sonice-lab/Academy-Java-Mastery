package sec04;

import java.util.Scanner;

public class Ex04_07 {
    public static void main(String[] args) {
// 3. 여럿 중 하나
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요.: ");

        int age = scanner.nextInt();
// else if는 여러번(1회 이상) 사용 가능, 2번 이상 사용할 경우 오류 발생
        if (age > 19)   {
            System.out.println("성인입니다!");

        } else if(age > 16) {
            System.out.println("고등학생입니다!");

        } else if(age > 13) {
            System.out.println("중학생입니다!");
        
        } else if(age > 7) {
            System.out.println("초등학생입니다!");
            
        } else { 
            System.out.println("미취학입니다!");
        }



        scanner.close();
    }
}
