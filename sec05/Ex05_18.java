package sec05;

public class Ex05_18 {
    public static void main(String[] args) {
        System.out.println("------*"); // 6개, 1개
        System.out.println("-----***"); // 5개, 3개
        System.out.println("----*****"); // 4개, 5개
        System.out.println("---*******"); // 3개, 7개
        System.out.println("--*********"); // 2개, 9개
        System.out.println("-***********"); // 1개, 11개
        System.out.println("*************"); // 0개, 13개

        System.out.println();

        for (int i = 0; i < 7; i++) {
            System.out.print(" ");
            for (int j = 0; j < 6 - i; j++) {
                System.out.print(" ");

                // for(int j = 0;j<6;j++){
                // System.out.print("-");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");

            }

            System.out.println();

        }

    }
}
