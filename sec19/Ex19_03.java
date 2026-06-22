package sec19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex19_03 {
    public static void main(String[] args) {
        OutputStream out = null;

        try {
            out = new FileOutputStream("src\\sec19\\write.txt");
            out.write('h');
            out.write('e');
            out.write('l');
            out.write('l');
            out.write('o');

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
