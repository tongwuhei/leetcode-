package leetCode.qne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author chj
 * @date 2021/9/14 16:43
 */
class t2 {
    /* Write Code Here */
    public int solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                list.add(arr[i]);
            } else {
                list2.add(arr[i]);
            }
        }
        int[] array1 = new int[list.size()];
        int[] array2 = new int[list2.size()];
        for (int i = 0; i < list.size(); i++) {
            array1[i] = list.get(i);
        }
        for (int i = 0; i < list2.size(); i++) {
            array2[i] = list2.get(i);
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        int ans = 0, k = 1, max = -100;
        for (int i = 1; i <= array2.length; i++) {
            for (int j = array2.length - 1; j > array2.length-1- i; j--) {
                ans = ans + array2[j] * k;
                k++;
            }
            for (int l = 0; l < array1.length; l++) {
                ans = ans + array1[l] * k;
                k++;
            }
            max = Math.max(ans, max);
            k = 1;
            ans = 0;
        }
        return max;
    }
}

class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for (int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }

        res = new t2().solution(_arr);
        System.out.println(String.valueOf(res));

    }
}
