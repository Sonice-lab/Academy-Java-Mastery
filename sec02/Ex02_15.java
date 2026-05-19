package sec02;

public class Ex02_15 {
    public static void main(String[] args) {
        char a = 'a';
        System.out.println(a);
        // 문자형(캐릭터)
        // 홑 따옴표 사용
        char b = 'b';
        System.out.println(b);

       int c = a; // 'a'의 코드 포인트(97)가 할당됨 
       System.out.println(c); 

       int d = b; 
       System.out.println(d);  // 아스키코드표(나무위키), 코드 포인트


        d = b; 
       System.out.println(d); 
       System.out.println(d + 1); 
       
       d = d + 1;



       char e = 99;
       System.out.println(e);
    }
    
}
