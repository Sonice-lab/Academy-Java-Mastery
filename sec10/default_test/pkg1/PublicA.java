package sec10.default_test.pkg1;

public class PublicA {
    public static void main(String[] args) {
        // 동일 패키지 내에거 default 접근 제한자 접근 가능
        DefaultA defaultA = new DefaultA();
        defaultA.varA = 1;
        System.out.println(defaultA.varA);
    }
}
