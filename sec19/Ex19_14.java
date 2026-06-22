package sec19;

import java.io.File;

public class Ex19_14 {
    public static void main(String[] args) {
        File file = new File("src\\sec19\\my_file.txt");

        System.out.println(file.length()); // 11 바이트의 파일의 크기라는 것을 의미
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.isFile());
    }
}
