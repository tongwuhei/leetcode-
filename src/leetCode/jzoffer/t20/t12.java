package leetCode.jzoffer.t20;

/**
 * @author chj
 * @date 2021/6/19 15:37
 */
public class t12 {
    public static double Power(double base, int exponent) {
        int num = exponent > 0 ? exponent : -exponent;
        double result = 1;
        if (exponent == 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            result = result * base;
        }
        return exponent > 0 ? result : 1 / result;
    }

    public static void main(String[] args) {
        System.out.println(Power(2.0000, 3));
    }
}
