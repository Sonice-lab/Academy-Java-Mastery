package sec10.practice.access2;

import sec10.practice.access1.Parent;

public class Child extends Parent {
    void accessParentMethod() {
        super.parentMethod();
    }

    // public static void main(String[] args) {
    // Child child = new Child();
    // child.accessParentMethod();
    // }

}
// 왜 이런지 찾아보기
