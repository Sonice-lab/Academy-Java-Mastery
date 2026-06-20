package sec17;

import java.math.BigDecimal;
import java.math.RoundingMode;

interface Calc {
    double round(int point);
}

public class P1703 {
    public static void main(String[] args) {
        double val = 34.12545;

        Calc cal = point -> {
            double val1 = new BigDecimal(val).setScale(point, RoundingMode.HALF_UP).doubleValue();
            return val1;
        };

        System.out.println("소수점 둘째자리 반올림: " + cal.round(2));

    }
}
