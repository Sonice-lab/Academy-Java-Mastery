package sec10.public_test.pkg2;

import sec10.public_test.pkg1.PublicA;

//import sec10.public_test.pkg1.PublicA;

public class PublicB {
    public static void main(String[] args) {
        // 접근제한자 public
        // 다른패키지라 하더라도 접근 가능
        PublicA PublicA = new PublicA(10); // 첫번째 PublicA 작성 후 ctrl + space > 패키지 임폴트가 불러와짐
        PublicA.printA();
    }
}
