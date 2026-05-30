package sec09.Practice;

class Book {
    String title;
    int page;

    Book() {}

    Book(String title, int page) {

        this.title = title;
        this.page = page;
    }
}

public class P0905 {
    public static void main(String[] args) {
        Book b1 = new Book("어린왕자", 300);
        Book b2 = new Book();

    }
}
