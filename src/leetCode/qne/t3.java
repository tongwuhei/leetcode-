package leetCode.qne;

/**
 * @author chj
 * @date 2021/9/14 16:03
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class t3 {
    /* Write Code Here */
    public int solution(String str) {
        StringBuilder builder = new StringBuilder(str);
        StringBuilder temp = new StringBuilder("0");
        String ss;
        int is = 0, ans = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int n = 2; (i + 3 * n - 2) <= str.length(); n++) {
                 ss = builder.substring(i, i + 3 * n - 2);
                temp = temp.append(ss);
                for (int j = 1; j <= n; j++) {
                    if (temp.charAt(j) == temp.charAt(2 * n - j) && temp.charAt(j) == temp.charAt(2 * n + j - 2)) {
                        if (j == n) {
                            is = 1;
                        }
                    } else {
                        break;
                    }
                }
                if (is == 1) {
                    ans++;
                    is = 0;
                }
                temp = temp.delete(1,temp.length());
            }
        }
        return ans;
    }
}

class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0;i<n;i++){
            String _str;
            try {
                _str = in.nextLine();
            } catch (Exception e) {
                _str = null;
            }
            res = new t3().solution(_str);
            System.out.println(String.valueOf(res));
        }


    }
}
