package sec10.protected_test.pkg2;

import sec10.protected_test.pkg1.Parent;

public class Child extends Parent {
    void accessTest() {
        // Parent parent = new Parent();
        super.accessProtected(); // 접근 불가

    }

    public static void main(String[] args) {
        Child child = new Child();
        child.accessProtected(); // protected 접근 제한자, 상속관계에서는 다른 클래스더라도 접근이 가능함, super 키워드 사용
    }

}
