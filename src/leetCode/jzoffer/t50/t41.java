package leetCode.jzoffer.t50;

import java.util.ArrayList;

/**
 * @author chj
 * @date 2021/8/26 9:45
 */
public class t41 {

    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();
        int i = 1, j = 2;
        int ans = i + j;
        while (i <= sum / 2) {
            if (ans == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    list.add(k);
                }
                arrays.add(list);
                j++;
                ans += j;
            } else if (ans < sum) {
                j++;
                ans += j;
            } else {
                ans = ans - i;
                i++;
            }
        }
        return arrays;
    }

    public static void main(String[] args) {
        System.out.println(FindContinuousSequence(9));
    }
}
