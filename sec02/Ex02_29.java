package sec02;

public class Ex02_29 {
    public static void main(String[] args) {
        // float > int
        float f1 = 1234.5f; //literary
        int i1 = (int) f1;
        System.out.println(f1);
        System.out.println(i1);

        //double > int
        double d1 = 1234.5;
        i1 = (int) d1;
        System.out.println(d1);
        System.out.println(i1); //소수점 이하 데이터 유실됨
    }
}
