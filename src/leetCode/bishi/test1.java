package leetCode.bishi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author chj
 * @date 2021/9/1 20:33
 * 5 --> 4
 */
public class test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int cur = 1, length;
        while (list.size() != 2) {
            length = list.size();
            cur = cur + 2;
            if (cur <= length) {
                list.remove(cur - 1);
            } else {
                cur = cur - length;
                list.remove(cur-1);
            }
        }
        System.out.println(list.get(1));

    }
}
