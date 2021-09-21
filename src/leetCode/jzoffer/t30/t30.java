package leetCode.jzoffer.t30;

/**
 * @author chj
 * @date 2021/8/14 11:00
 * <p>
 * 输入一个整型数组，数组里有正数也有负数。数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。要求时间复杂度为 O(n).
 */
public class t30 {

    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            array[i - 1] = array[i - 1] > 0 ? array[i - 1] : 0;
            array[i] = array[i] + array[i - 1];
            max = max > array[i] ? max : array[i];
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
