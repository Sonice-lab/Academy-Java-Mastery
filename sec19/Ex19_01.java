package sec19;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex19_01 {
    public static void main(String[] args) {
        int read = 0;

        InputStream in = null;
        try {
            in = new FileInputStream("src\\sec19\\my_file.txt");

            // System.out.println(in.read()); // 아스키코드로 104 출력
            while (true) {
                read = in.read();

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
