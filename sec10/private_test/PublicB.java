package sec10.private_test;

public class PublicB {
    public static void main(String[] args) {
        PublicA publicA = new PublicA();
        // PublicA.a = 1;
        publicA.setA(1);
        System.out.println((publicA.getA()));
    }
}
