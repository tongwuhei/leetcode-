package leetCode.jzoffer.t10;

/**
 * @author chj
 * @date 2021/6/6 16:44
 */
public class t6 {
    public static int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int l = 0, r = array.length - 1, mid;
        while (l < r) {
            mid = (l + r) >> 1;
            if (array[l] < array[r]) {
                return array[l];
            }
            if (array[mid] > array[r]) {
                l = mid + 1;
            } else if (array[mid] < array[r]) {
                l = mid;
            } else {
                r = r - 1;
            }
        }

        return array[l];
    }

    public static void main(String[] args) {
        int[] num = new int[]{3, 4, 5, 1, 2};
        System.out.println(minNumberInRotateArray(num));
    }
}
