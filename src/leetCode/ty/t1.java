package leetCode.ty;

/**
 * @author chj
 * @date 2021/9/14 19:58
 */
public class t1 {
    public String longestPalindrome(String str) {
        // write code here
        StringBuilder builder = new StringBuilder(str);
        String ans = "";
        String temp;
        int l = 0, r = 0, is = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                temp = builder.substring(i, j);
                l = 0;
                r = temp.length() - 1;
                while (l < r) {
                    if (temp.charAt(l) == temp.charAt(r)) {
                        l++;
                        r--;
                    } else {
                        break;
                    }
                    if (l >= r) {
                        ans = ans.length() >= temp.length() ? ans : temp;
                    }
                }
            }
        }
        return ans;
    }
}
