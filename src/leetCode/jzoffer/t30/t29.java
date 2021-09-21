package leetCode.jzoffer.t30;

import java.util.ArrayList;

/**
 * @author chj
 * @date 2021/8/14 9:07
 * <p>
 * 给定一个数组，找出其中最小的K个数。例如数组元素是4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4。
 * 0 <= k <= input.length <= 10000
 * 0 <= input[i] <= 10000
 */
public class t29 {

    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>(k);
        if (k == 0 || k > input.length) {
            return list;
        }
        quickSort(input, 0, input.length - 1);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }

    static void quickSort(int[] input, int l, int r) {
        if (l>r){
            return;
        }
        int temp = input[l], i = l, j = r;
        while (i != j) {
            while (j>i&& temp <= input[j]){
                j--;
            }
            input[i] = input[j];

            while (i<j && temp >=input[i]){
                i++;
            }
            input[j] = input[i];

        }
        input[i] =temp;
        quickSort(input,l,j-1);
        quickSort(input,j+1,r);
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 1, 6, 2, 7, 3, 8};
        System.out.println(GetLeastNumbers_Solution(arr, 4));
    }
}
