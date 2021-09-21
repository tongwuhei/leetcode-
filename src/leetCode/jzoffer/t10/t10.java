package leetCode.jzoffer.t10;

/**
 * @author chj
 * @date 2021/6/6 20:24
 */
public class t10 {
    public int rectCover(int target) {
        if (target <= 2) {
            return target;
        }
        int first = 1, second = 2, tmp = 0;
        for (int i = 3; i <= target; i++) {
            tmp = first;
            first = second;
            second = tmp + second;
        }
        return second;
    }
}
