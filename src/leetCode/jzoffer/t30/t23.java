package leetCode.jzoffer.t30;

/**
 * @author chj
 * @date 2021/8/12 20:41
 */
public class t23 {

    public static boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return check(sequence, 0, sequence.length - 1);
    }

    public static boolean check(int[] sequence, int l, int r) {
        if (l >= r) {
            return true;
        }
        int i;
        for (i = l; i < r; i++) {
            if (sequence[i] > sequence[r]) {
                break;
            }
        }
        int j = i;
        for (j = i; j < r; j++) {
            if (sequence[j] < sequence[r]) {
                return false;
            }
        }
        return check(sequence, l, i - 1) && check(sequence, i, r - 1);
    }

    public static void main(String[] args) {
        int[] sequence = {4, 8, 6, 12, 16, 14, 10};
        System.out.println(VerifySquenceOfBST(sequence));
    }
}
