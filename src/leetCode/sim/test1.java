package leetCode.sim;

import java.util.HashMap;
import java.util.Map;

/**
 *  两数之和
 * @author chj
 * @date 2021/4/15 10:41
 */
public class test1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
