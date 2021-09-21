package leetCode.zazz;

/**
 * @author chj
 * @date 2021/9/9 11:14
 */
public class huiwenzichuan {

    public int getLongestPalindrome(String A, int n) {
        // write code here
        char[] ch = A.toCharArray();
        int res = 0;
        for(int i = 0; i < n; i++){
            int l = i, r = i, sameR = i;
            //定位左右两边,避免abba和aba
            while(l - 1 >= 0 && ch[l - 1] == ch[i]) {
                l--;
            }
            while(r + 1 < n && ch[r + 1] == ch[i]) {
                r++;
            }
            sameR = r;

            while(l - 1 >= 0 && r + 1 < n && ch[l - 1] == ch[r + 1]){
                l--;
                r++;
            }

            res = Math.max(res, r - l + 1);

            //优化
            i = sameR;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
