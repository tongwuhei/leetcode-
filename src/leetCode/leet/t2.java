package leetCode.leet;

/**
 * @author chj
 * @date 2021/8/25 16:07
 * <p>
 * 53. 最大子序和
 */


public class t2 {

    public static int maxSubArray(int[] nums) {
        int dp = nums[0], max = dp;
        for (int i = 1; i < nums.length; i++) {
            dp = Math.max(nums[i], dp + nums[i]);
            max = Math.max(max, dp);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
