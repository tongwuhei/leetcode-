package leetCode.zazz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author chj
 * @date 2021/6/4 16:48
 */
public class sda {

    private static int tom(List<Integer> num, int x, int y) {
        int length = num.size();
        if (length / 2 < x || length / 2 + length % 2 > y) {
            return -1;
        } else {
            if (x + y >= length+1) {
                return num.get(x);
            } else {
                if (length % 2 == 1) {
                    return num.get(length - 1 - y);
                } else {
                    return num.get(length - y);
                }
            }
        }
    }

    public static void main(String[] args) {
        int m;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
        }
        Collections.sort(num);
        int a = tom(num, x, y);
        System.out.println(a);
    }
}
