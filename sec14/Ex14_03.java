package sec14;

public class Ex14_03 {
    public static void main(String[] args) {
        String str1 = "11";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1 + num1);

        String str2 = "11.1";
        int num2 = Integer.parseInt(str2);
        System.out.println(num2 + num2); // NumberFormatException >double 로 바꿔주어야 함

    }
}
