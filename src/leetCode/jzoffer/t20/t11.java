package leetCode.jzoffer.t20;

/**
 * @author chj
 * @date 2021/6/6 20:54
 */
public class t11 {
    public int NumberOf1(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] gray = new String[]{"0", "1"};
        String[] list = new String[1000];
        list = gray.clone();
        System.out.println(gray.hashCode());
        System.out.println(list.hashCode());
    }
}
