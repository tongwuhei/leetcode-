package leetCode.jzoffer.t20;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chj
 * @date 2021/6/20 18:51
 */
public class t19 {

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int h = matrix.length;
        int w = matrix[0].length;
        int w1 = 0, h1 = 0;
        int i, j, k, l;
        while (h > h1 && w > w1) {
            for (i = w1; i < w; i++) {
                list.add(matrix[h1][i]);
            }
            h1++;
            for (j = h1; j < h; j++) {
                list.add(matrix[j][w - 1]);
            }
            w--;
            if (w == 0) {
                break;
            }
            if (h > h1) {
                for (k = w - 1; k >= w1; k--) {
                    list.add(matrix[h - 1][k]);
                }
            }
            h--;
            if (h == 0 || w <= w1) {
                break;
            }
            for (l = h - 1; l >= h1; l--) {
                list.add(matrix[l][w1]);
            }
            w1++;
        }
        return list;
    }

    public static void main(String[] args) {
//        int[][] arr = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
//        int[][] arr = {{1}, {2}, {3}, {4}, {5}};
//        int[][] arr = {{1, 2, 3, 4, 5}};
        int[][] arr = {{1, 2, 3}, {6, 7, 8}, {11, 12, 13}, {16, 17, 18}, {21, 22, 23}};
        System.out.println(printMatrix(arr));
    }
}
