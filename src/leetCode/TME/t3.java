package leetCode.TME;

/**
 * @author chj
 * @date 2021/9/16 19:19
 */
public class t3 {

    public static long to(long i, int k) {
        long  ans = 0;
        while (true) {
            if (i % k == 1) {
            ans++;
        }
            i = i / k;

            if (i < k) {
                break;
            }
        }
        if (i == 1) {
            ans++;
        }
        return ans;
    }

    public static long minM(int n, int k) {
        // write code here
        long num1 = 0;
        long i = 0;
        while (num1 < n) {
            i++;
            num1 = num1 + to(i, k);
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(to(10, 2));
        System.out.println(minM(5, 3));
    }

}
