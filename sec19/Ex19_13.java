package sec19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex19_13 {
    public static void main(String[] args) {
        OutputStream out = null;
        OutputStreamWriter outWriter = null;

        try {
            out = new FileOutputStream("src\\sec19\\write_kor.txt");
            outWriter = new OutputStreamWriter(out, "UTF-8");
            outWriter.write("안녕");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outWriter != null) {
                    outWriter.close();
                }
                if (out != null) {
                    out.close(); 
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
