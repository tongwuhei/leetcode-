package leetCode.tencent;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author chj
 * @date 2021/8/29 10:47
 */
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] ss = sc.nextLine().split(" ");
        ArrayList<Integer> l = new ArrayList<>();
        l.add(Integer.parseInt(ss[0]));
        int k = 0;
        ArrayList<Integer> r = new ArrayList<>();
        r.add(1);
        for (int i = 1; i < ss.length; i++) {
            if (!ss[i].equals(ss[i - 1])) {
                l.add(Integer.parseInt(ss[i]));
                k++;
                r.add(1);
            } else {
                r.set(k,r.get(k) + 1);
            }
        }
        int ans = 0, temp = 0;
        for (int i = 1; i < l.size(); i++) {
            int m = i;
            while (m >= 0) {
                if (l.get(m) < l.get(i)) {
                    temp++;
                }
                m--;
            }
            ans = ans + temp * r.get(i);
            temp = 0;
        }
        System.out.println(ans);
    }

}

