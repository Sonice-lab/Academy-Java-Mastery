package sec09;

class Book {
    String title = "제목없음";
    int series = 1;
    int page = 100;

    Book() {
    }

    Book(String t) {
        title = t;
    }

    Book(String t, int p) {
        title = t;
        page = p;
    }

    Book(int s, String t) {
        title = t;
        series = s;
    }
}

public class Ex09_06 {
    public static void main(String[] args) {
        Book book = new Book();
        book = new Book("멘토 자바");
        book = new Book("멘토 자바", 300);
        book = new Book(3, "멘토 자바");
    }
}
