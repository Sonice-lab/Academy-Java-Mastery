package sec19;

//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.Reader;

public class Ex19_07 {
    public static void main(String[] args) {
        int read = 0;

        Reader in = null;
        try {
            in = new FileReader("src\\sec19\\my_file_kor.txt");

            while (true) {
                read = in.read();

                if (read == -1) {
                    break;
                }

                System.out.print((char) read); // 문자 깨짐 이슈
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
