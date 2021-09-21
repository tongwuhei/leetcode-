package leetCode.jzoffer.t50;

import java.util.ArrayList;

/**
 * @author chj
 * @date 2021/8/26 10:23
 */
public class t42 {

    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = array.length;
        int ans;
        while (i < j) {
            ans = array[i] + array[j];
            if (ans == sum) {
                list.add(array[i]);
                list.add(array[j]);
                break;
            } else if (ans < sum) {
                i++;
            } else {
                j--;
            }
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
