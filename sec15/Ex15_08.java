package sec15;

public class Ex15_08 {
    public static void main(String[] args) {
        String word = "1I2LOVE3YOU45";

        String text = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 65 && ch <= 90) {
                text += ch;
            } else {
                text += " ";
            }
        }

        System.out.println(text);
    }
}
