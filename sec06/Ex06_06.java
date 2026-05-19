package sec06;

public class Ex06_06 {
    public static void main(String[] args) {
        char[] cards = { '1', 'L', 'O', '2', 'V', '3', 'E' };

        String myWord = "";
        // System.out.println((int) cards[1]);

        // System.out.println(cards.length);//length는 값을 의미한다. 배열의 크기 정보를 확인한다.

        for (int i = 0; i < cards.length; i++) {
            int word = cards[i];

            if (word >= 65 && word <= 90) {
                myWord += (char) word;
            }
        }

        System.out.println(myWord);

    }
}
