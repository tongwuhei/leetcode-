package leetCode.jzoffer.t50;

import java.util.Arrays;

/**
 * @author chj
 * @date 2021/8/26 11:06
 */
public class t45 {
    public boolean IsContinuous(int[] numbers) {
        Arrays.sort(numbers);
        int k = 0,i;
        for (i = numbers.length - 1; i > 0 && numbers[i-1] != 0; i--) {
            if (numbers[i] == numbers[i - 1]) {
                return false;
            }
            if (numbers[i] > 0 && numbers[i - 1] > 0) {
                k = k + (numbers[i] - numbers[i - 1] - 1);
            }
        }
        if (k ==0 || k == i){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
