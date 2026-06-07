package sec13;

class PrintOut {
    // 정적 내부 클래스
    static class Out {
        void println(String str) {
            System.out.println(str);
        }
    }
}

public class StaticClassExam {
    public static void main(String[] args) {
        PrintOut.Out out = new PrintOut.Out();
        out.println("정적 내부 클래스 테스트");
    }
}
