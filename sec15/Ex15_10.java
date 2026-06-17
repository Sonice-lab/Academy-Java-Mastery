package sec15;

public class Ex15_10 {
    public static void main(String[] args) {
        String s = "하나";
        s += "둘";
        s += "셋";

        System.out.println(s);

        System.out.println("---");
        // String에 비해 StringBuilder, StringBuffer는 메모리를 효율적으로 이용가능(절약)
        // StringBuffer는 스레드 환경에서 StringBuilder가 더 유리하다.
        StringBuilder sb = new StringBuilder("하나");
        sb.append("둘");
        sb.append("셋");
        System.out.println(sb);

        System.out.println("---");

        StringBuffer sbf = new StringBuffer("하나");
        sbf.append("둘");
        sbf.append("셋");
        System.out.println(sbf);

        System.out.println(s.length());
        System.out.println(sb.length());
        System.out.println(sbf.length());
    }
}
