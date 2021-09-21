package leetCode.aqiyi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author chj
 * @date 2021/9/12 15:21
 */
public class t1 {
    static int getSum(int n) {
        int g = n % 10, s = 0, b = 0, q = 0;
        int temp = n - g;
        if (temp > 0) {
            temp = temp / 10;
            s = temp % 10;
        }
        temp = temp - s;
        if (temp > 0) {
            temp = temp / 10;
            b = temp % 10;
        }
        temp = temp - b;
        if (temp > 0) {
            temp = temp / 10;
            q = temp % 10;
        }
        return g + s + b + q;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        int max = 0;
        for (int i = 1; i <= n; i++) {
            int temp = getSum(i);
            if (!map1.containsKey(temp)) {
                map1.put(temp, 1);
            } else {
                map1.replace(temp, map1.get(temp) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int temp = entry.getValue();
            if (temp!=1){
                if (!map2.containsKey(temp)) {
                    map2.put(temp, 1);
                } else {
                    map2.replace(temp, map2.get(temp) + 1);
                }
                max = Math.max(max, map2.get(temp));
            }
        }
        System.out.println(max);
    }
}
