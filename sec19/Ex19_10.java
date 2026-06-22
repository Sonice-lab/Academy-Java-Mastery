package sec19;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex19_10 {
    public static void main(String[] args) {
        int read = 0;

        FileInputStream in = null;
        BufferedInputStream bin = null;

        try {
            in = new FileInputStream("src\\sec19\\my_file.txt");
            bin = new BufferedInputStream(in);

            // System.out.println(in.read()); // 아스키코드로 104 출력
            while (true) {
                read = bin.read(); // ★

                if (read == -1) {
                    break;
                }

                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
