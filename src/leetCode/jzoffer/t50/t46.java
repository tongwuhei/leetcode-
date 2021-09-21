package leetCode.jzoffer.t50;

import java.util.ArrayList;

/**
 * @author chj
 * @date 2021/8/28 10:39
 */
public class t46 {

    public static int LastRemaining_Solution(int n, int m) {
        if (n == 0) {
            return -1;
        }
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array.add(i, i);
        }
        int i = 0, k = 0;
        while (array.size() > 1) {
            while (k < m - 1) {
                if (i + 1 >= array.size()) {
                    i = 0;
                } else {
                    i++;
                }
                k++;
            }
            array.remove(i);
            if (i >= array.size()) {
                i = 0;
            }
            k = 0;
        }
        return array.get(0);
    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(5, 3));
    }
}
