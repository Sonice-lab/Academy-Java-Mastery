package sec14;

public class Ex14_02 {
    public static void main(String[] args) {

        String[] strArr = null;
        System.out.println(strArr[0]);

        int[] intArr = { 1, 2, 3 };

        System.out.println(intArr[3]);// NullPointerException
        // System.out.println(intArr[3]);
    }
}
