package sec05.Practice;

public class P0506 {
    public static void main(String[] args) {
        System.out.println("------*"); // --3, *-1
        System.out.println("----*-*-*-"); // --2, *-3
        System.out.println("--*-*-*-*-*-"); // --1, *-5
        System.out.println("*-*-*-*-*-*-*-"); // --0, *-7

        for (int i = 0; i < 4; i++) {
            for (int j = 3; j - i > 0; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < (i * 2) + 1; j++) {
                System.out.print("* ");

            }

            // System.out.print("*");
            System.out.println();

        }

    }
}
