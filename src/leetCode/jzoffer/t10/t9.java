package leetCode.jzoffer.t10;

/**
 * @author chj
 * @date 2021/6/6 20:12
 */
public class t9 {
    public int jumpFloorII(int target) {
        if (target == 1) {
            return 1;
        } else if (target == 2) {
            return 2;
        } else {
            return (int) Math.pow(2, target - 1);
        }
    }
}
