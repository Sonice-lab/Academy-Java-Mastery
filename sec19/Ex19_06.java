package sec19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//이미지 불러오기 > 05실습보다 더 빠름(배열을 사용한 경우)
public class Ex19_06 {
    public static void main(String[] args) {
        FileInputStream input = null;
        FileOutputStream output = null;

        try {
            input = new FileInputStream("src\\sec19\\cat.jpg");
            output = new FileOutputStream("src\\sec19\\cat_new.jpg");
            byte[] buffer = new byte[1024];

            long start = System.currentTimeMillis();

            System.out.println("--- 이미지 읽기 시작 ---");
            int read = 0;

            while ((read = input.read(buffer)) != -1) {
                output.write(buffer, 0, read);
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
