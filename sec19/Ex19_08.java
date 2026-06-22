package sec19;

//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStream;
import java.io.Reader;

public class Ex19_08 {
    public static void main(String[] args) {
        int read = 0;

        Reader in = null;
        try {
            in = new FileReader("src\\sec19\\my_file_kor.txt");
            char[] buffer = new char[256];// 256은 배역의 크기를 의미, 이진수에 의해 늘어나는 크기 2의 8승 > 상자의 숫자가 달라질수록 파일을 인지하는 시간도 달라짐

            while (true) {
                read = in.read(buffer);

                if (read == -1) {
                    break;
                }

                // System.out.print(new String(buffer, 0, read)); // 문자 깨짐 이슈 해결
                System.out.print(String.valueOf(buffer, 0, read)); // 권장되는 방식
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
