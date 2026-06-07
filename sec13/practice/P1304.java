package sec13.practice;

class InnerExam {

    int plus(int value) { // 로컬클래스는 상수만 취급하기 때문에 변경이 되지 않음
        class Cal {
            int add() {

                return value + 1; // !!!!!!

            }
        }
        Cal cal = new Cal();
        return cal.add();
    }
}

public class P1304 {
    public static void main(String[] args) {
        InnerExam ie = new InnerExam();
        System.out.println(ie.plus(10));
    }
}
