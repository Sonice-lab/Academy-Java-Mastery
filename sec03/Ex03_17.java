package sec03;

public class Ex03_17 {
    public static void main(String[] args) {
        boolean isRain = true;

        boolean printMessage = isRain ? printMessage1() : printMessage2();

}
    
    
    static boolean printMessage1(){
        System.out.println("우산을 챙깁니다!");
        return true;
    }    
        

    static boolean printMessage2(){
        System.out.println("우산을 챙기지 않습니다!");
        return true;

}
}
