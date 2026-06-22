package sec19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//바이트 기반 스트리밍(텍스트, 직접 입력)
public class Ex19_04 {
    public static void main(String[] args) {
        OutputStream out = null;

        try {
            out = new FileOutputStream("src\\sec19\\write.txt");
            String str = "hello java";
            byte[] strArr = str.getBytes();
            out.write(strArr);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
