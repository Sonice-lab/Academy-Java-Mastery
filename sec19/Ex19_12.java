package sec19;

//import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex19_12 {
    public static void main(String[] args) {
        int read = 0;

        InputStream in = null;
        InputStreamReader is = null;

        try {

            in = new FileInputStream("src\\sec19\\my_file_kor.txt");
            is = new InputStreamReader(in, "UTF-8"); // 한글을 어떤 방식으로 처리할 것인가? ex) cp949,UTF-8

            while (true) {
                read = is.read(); // ★

                if (read == -1) {
                    break;
                }

                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) { // 보조 > 기반 순으로 닫기
                    is.close();
                }
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
