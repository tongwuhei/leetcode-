package leetCode.zazz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author chj
 * @date 2021/6/4 17:21
 */
public class sda2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
        }
        Collections.sort(num);
        for (int j = 1; j <= n; j++) {
            int abs = Math.abs(j - num.get(j - 1));
            sum = sum + abs;
        }
        System.out.println(sum);
    }
}
