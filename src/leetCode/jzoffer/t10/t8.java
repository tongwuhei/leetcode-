package leetCode.jzoffer.t10;

/**
 * @author chj
 * @date 2021/6/6 20:02
 */
public class t8 {
    public static int jumpFloor(int target) {
        if (target <= 0) {
            return 1;
        }
        if (target == 1) {
            return 1;
        } else {
            return jumpFloor(target - 1) + jumpFloor(target - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(4));
    }
}
