package sec03;

public class Ex03_15 {
    public static void main(String[] args) {
        // 논리연산자
        // 평가 결과는 boolean

        //논리곱 (AND 연산)에서는 
        // FALSE가 하나라도 있으면 모두 FALSE 
        System.out.println(true && true); 
        System.out.println(true && false);
        System.out.println(false && true); // 단축 평가
        System.out.println(false && false);
        
        
        
        System.out.println("---");
        
        // OR연산
        // true가 하나라도 있으면 true
        System.out.println(true || true); //이거 왜 노란색이지? > 노란색으로 되어있는 부분은 코딩을 읽지 않는다.
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("---");
        
        // 배타적 논리합 연산
        // 비교 대상(비교값)이 서로 다를 때만 true
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(false^false);

        System.out.println("------"); 

        //단축평가
        boolean isRain = true;
        boolean result = (isRain && printMessage()); //단축 평가로 printMessage() 메서드 호출(실행) 여부 결정
         
    }
    static boolean printMessage(){
        System.out.println("우산을 챙깁니다!");
        return true;

    }
}
