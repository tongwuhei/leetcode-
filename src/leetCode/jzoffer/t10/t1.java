package leetCode.jzoffer.t10;

/**
 * @author chj
 * @date 2021/6/5 15:56
 */
public class t1 {

    static boolean degui(int l, int r, int[] arr, int target) {
        if (l > r) {
            return false;
        }
        int mid = (l + r) / 2;

        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] > target) {
            return degui(l, mid - 1, arr, target);
        } else {
            return degui(mid + 1, r, arr, target);
        }

    }

    public static boolean Find(int target, int[][] array) {

        int i = 0, j = array[0].length-1;
        while (i < array.length && j >=0) {
            if (array[i][j] == target) {
                return true;
            }else if (array[i][j] > target) {
                j--;
            }else {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        int target = 1;
        System.out.println(Find(target, array));
    }
}
