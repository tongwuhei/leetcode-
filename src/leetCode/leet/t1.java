package leetCode.leet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chj
 * @date 2021/6/18 19:28
 */
public class t1 {

    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                break;
            } else {
                map.put(nums[i], 1);
            }
        }
        return nums[i];
    }

    public static void main(String[] args) {

    }
}
