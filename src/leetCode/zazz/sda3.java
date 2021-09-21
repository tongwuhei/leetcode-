package leetCode.zazz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author chj
 * @date 2021/6/5 14:57
 */
public class sda3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m, n, num;
        for (int i = 0; i < t; i++) {
            List<Integer> sum = new ArrayList<>();
            n = sc.nextInt();
            StringBuffer nn = new StringBuffer(sc.next());
            m = sc.nextInt();
            StringBuffer mm = new StringBuffer(sc.next());
            for (int j = 0; j < m; j++) {
                if (mm.charAt(j) == 'M') {
                    if (nn.toString().contains("1")) {
                        num = nn.indexOf("1");
                        sum.add(num+1);
                        nn.setCharAt(num, '2');
                    } else {
                        num = nn.indexOf("0");
                        sum.add(num+1);
                        nn.setCharAt(num, '1');
                    }
                } else {
                    if (nn.toString().contains("0")) {
                        num = nn.indexOf("0");
                        sum.add(num+1);
                        nn.setCharAt(num, '1');
                    } else {
                        num = nn.indexOf("1");
                        sum.add(num+1);
                        nn.setCharAt(num, '2');
                    }
                }

            }

            for (Integer a : sum){
                System.out.println(a);
            }
        }
    }
}
