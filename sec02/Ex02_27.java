package sec02;

public class Ex02_27 {
    public static void main(String[] args) {
        int i = 10;
        byte b =(byte)i;
        System.out.println(b);

        i = 1000;
        b = (byte) i;
        System.out.println(b); //쓰레기값 출력

    }
    
}
