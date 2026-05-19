package sec05.Practice;

public class P0505 {
        public static void main(String[] args) {
                System.out.println("---*-"); //---, *- 1
                System.out.println("--*-*-"); //--,*- 2
                System.out.println("-*-*-*-"); //-, *- 3
                System.out.println("*-*-*-*"); // *-4

                for (int i = 0; i < 4; i++) {
                        for (int j = 3 - i; j > 0; j--) {
                                System.out.print(" ");
                        }
                        for (int j = 0; j < i + 1; j++) {
                                System.out.print("* ");

                        }

                        System.out.println();
                }
        }
}