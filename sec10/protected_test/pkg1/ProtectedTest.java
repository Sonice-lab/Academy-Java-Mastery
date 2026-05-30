package sec10.protected_test.pkg1;

public class ProtectedTest {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.accessProtected();
        // protected 접근 제한자는 동일 패키지에서 접근 가능
        // 다른 패키지일 경우 상속 관계에서 접근 가능
    }
}
