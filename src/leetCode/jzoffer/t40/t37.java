package leetCode.jzoffer.t40;

/**
 * @author chj
 * @date 2021/8/19 10:12
 */
public class t37 {

    public static int GetNumberOfK(int[] array, int k) {
        if (array.length == 1) {
            return array[0] == k ? 1 : 0;
        }
        int mid, l = 0, r = array.length - 1;
        mid = (r + l) / 2;
        while (r > l) {
            if (array[mid] == k) {
                break;
            }
            if (array[mid] > k) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
            mid = (l + r) / 2;
        }
        if (l >= r) {
            return 0;
        }
        int sum = 1;
        r = l = mid;
        for (l = l - 1; l >= 0; l--) {
            if (array[l] == k) {
                sum++;
            } else {
                break;
            }
        }
        for (r = r + 1; r <= array.length - 1; r++) {
            if (array[r] == k) {
                sum++;
            } else {
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {3};
        System.out.println(GetNumberOfK(array, 3));
    }
}
