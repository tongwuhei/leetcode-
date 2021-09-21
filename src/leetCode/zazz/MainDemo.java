package leetCode.zazz;


import java.util.Scanner;

/**
 * @author chj
 * @date 2021/8/24 15:29
 */
public class MainDemo {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] ss = sc.nextLine().split(" ");
            int[] array = new int[ss.length];
            for (int i = 0; i < ss.length; i++) {
                array[i] = Integer.parseInt(ss[i]);
            }
            int i = 0, j;
            int max = 0, temp = 0;
            int l = 0, r = 0;
            for (i = 0; i < array.length; ) {
                if (array[i] == 0) {
                    for (j = i; j < array.length && array[j] == 0; j++) {
                        temp++;
                    }

                    i = j;
                    max = max > temp ? max : temp;
                    temp = 0;
                } else {
                    i++;
                }
            }
            if (array[0] == 0) {
                for (int k = 0; k < array.length && array[k] == 0; k++) {
                    l++;
                }
            }
            if (array[array.length - 1] == 0) {
                for (int k = array.length - 1; k >= 0 && array[k] == 0; k--) {
                    r++;
                }
            }
            int result = Math.max(l,Math.max(r,(max+1)/2));
            System.out.println(result);
    }
}
