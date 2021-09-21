package leetCode.jzoffer.t20;

import java.util.Arrays;

/**
 * @author chj
 * @date 2021/6/19 15:48
 */
public class t13 {

    public static int[] reOrderArray(int[] array) {
        int[] array2 = new int[array.length];
        int i = 0, j = array.length-1, k = 0, l = array.length-1;
        while (i != array.length) {
            if (array[i] % 2 == 1) {
                array2[k] = array[i];
                k++;
            }
            if (array[j] % 2 == 0) {
                array2[l] = array[j];
                l--;
            }
            i++;
            j--;
        }
        return array2;

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 1) {
//                array2[j] = array[i];
//                j++;
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                array2[j] = array[i];
//                j++;
//            }
//        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4};
        System.out.println(Arrays.toString(reOrderArray(array)));
    }
}
