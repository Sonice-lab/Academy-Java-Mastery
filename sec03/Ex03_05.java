package sec03;

public class Ex03_05 {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(++num); // 전위(Prefix)
        System.out.println(num++); // 후위(Postfix)
        System.out.println(num); 

        System.out.println(--num);
        System.out.println(num--);
        System.out.println(num);

    }
}
