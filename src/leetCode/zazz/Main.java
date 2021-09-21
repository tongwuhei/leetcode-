package leetCode.zazz;

import java.util.Scanner;

/**
 * @author chj
 * @date 2021/8/29 10:13
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        StringBuilder builder = new StringBuilder();
        int cur = 0, i = 1;
        int k = 1;
        int num = 0;
        while (builder.length() < s2.length()) {
            char ss = s2.charAt(cur);
            for (char c : s1.toCharArray()) {
                if (c == ss) {
                    builder.append(c);
                    if (builder.length() == s2.length()) {
                        break;
                    }
                    cur += 1;
                    ss = s2.charAt(cur);
                }
                k++;
            }
            num =k;
            k = 1;
            i++;
        }
        int temp = s1.length() - num;
        System.out.println(s1.length() * (i - 1) - s2.length()-temp);
    }
}

