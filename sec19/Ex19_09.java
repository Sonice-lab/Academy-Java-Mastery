package sec19;

import java.io.FileWriter;
import java.io.IOException;

import java.io.Writer;

public class Ex19_09 {
    public static void main(String[] args) {
        Writer out = null;

        try {
            out = new FileWriter("src\\sec19\\file_writer.txt");
            out.write('안');
            out.write('녕');

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
