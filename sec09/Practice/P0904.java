package sec09.Practice;

class Computer {
    String brand;

    Computer(String brand) {
        // brand = name;
        this.brand = brand;

    }

    void logo() {
        System.out.println("사랑해요 " + brand);
    }
}

public class P0904 {
    public static void main(String[] args) {
        Computer computer1 = new Computer("LG");
        computer1.logo();

    }
}
