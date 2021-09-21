package leetCode.jzoffer.t40;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chj
 * @date 2021/8/20 15:53
 */
public class t40 {

    public static int[] FindNumsAppearOnce(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : array) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.remove(num);
            }
        }
        int[] result = new int[2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[i] = entry.getKey();
            i++;
        }
        if (result[0] > result[1]) {
            int temp = result[0];
            result[0] = result[1];
            result[1] = temp;
        }
        return result;

    }

    public static void main(String[] args) {
        int [] array = {1,4,1,6};
        System.out.println(FindNumsAppearOnce(array).length);
    }
}
