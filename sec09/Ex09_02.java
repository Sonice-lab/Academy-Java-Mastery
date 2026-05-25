package sec09;

// Snack() {}를 호출한 것임
public class Ex09_02 {
    public static void main(String[] args) {
        Snack chip = new Snack(2000); // 01 파일에서 Snack(int p) { price = p;}을 가져와서 반영되는 것임
        // chip.price = 2000;
        chip.info();
    }
}
