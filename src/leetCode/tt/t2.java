package leetCode.tt;

import java.util.Scanner;

/**
 * @author chj
 * @date 2021/9/9 19:33
 */
public class t2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split(" ");
        int n = Integer.parseInt(ss[0]);
        int k = Integer.parseInt(ss[1]);
        int [] array = new int[n];
        String[] s2 = sc.nextLine().split(" ");
        for (int i =0 ;i< n;i++){
            array[i] = Integer.parseInt(s2[i]);
        }
        int min = 99999;
        if (n == 1){
            System.out.println(0);
        }
        for (int i = 1;i<n;i++){
            if (array[i] != array[i-1]){
                int num = Math.abs(array[i] - array[i-1]);
                min = Math.min(min,num);
            }
        }
        System.out.println(min);

    }
}
