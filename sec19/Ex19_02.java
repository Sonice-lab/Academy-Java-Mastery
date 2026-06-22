package sec19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex19_02 {
    public static void main(String[] args) {
        int read = 0;

        InputStream in = null;

        byte[] buffer = new byte[5]; // []안의 숫자는 배열의 크기를 의미

        try {
            in = new FileInputStream("src\\sec19\\my_file.txt");

            // System.out.println(in.read()); // 아스키코드로 104 출력
            while (true) {
                read = in.read(buffer); // read는 배열 안의 요소의 갯수를 의미함

                if (read == -1) {
                    break;
                }

                System.out.print(new String(buffer, 0, read)); // new Stringdml 괄호 마지막 세번째 칸에 read 입력(5,5,1)
                                                               // > hello world 출력
                                                               // 숫자 5 입력 > hello worldworl로 출력(5,5,5)

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
