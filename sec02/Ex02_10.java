package sec02;

public class Ex02_10 {
    public static void main(String[] args) {
        int myAge = 20;
        int yourAge = 30;
        int temp;

        // swap 알고리즘

        temp = yourAge;
        yourAge = myAge;
        myAge = temp;
        

        System.out.println(myAge);
        System.out.println(yourAge);

        // System.out.println(myAge); 변수의 사용범위(scope) 주의!


    }
    
}
