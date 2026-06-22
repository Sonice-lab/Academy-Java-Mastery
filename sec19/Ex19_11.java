package sec19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//import java.io.OutputStream;
//이미지 불러오기
public class Ex19_11 {
    public static void main(String[] args) {
        FileInputStream input = null;
        BufferedInputStream binput = null;
        FileOutputStream output = null;
        BufferedOutputStream boutput = null;

        try {
            input = new FileInputStream("src\\sec19\\cat.jpg");
            binput = new BufferedInputStream(input);

            output = new FileOutputStream("src\\sec19\\cat_new.jpg");
            boutput = new BufferedOutputStream(output);

            long start = System.currentTimeMillis();

            System.out.println("--- 이미지 읽기 시작 ---");
            int read = 0;

            while ((read = binput.read()) != -1) {
                boutput.write(read);
            }

            System.out.println("--- 이미지 읽기 종료 ---");
            long end = System.currentTimeMillis();
            long time = (end - start);
            System.out.println(time + "밀리초");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) {
                    input.close();
                }
                if (output != null) {
                    output.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
