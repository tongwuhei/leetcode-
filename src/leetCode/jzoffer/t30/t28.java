package leetCode.jzoffer.t30;

/**
 * @author chj
 * @date 2021/8/13 15:28
 */
public class t28 {

    public static int MoreThanHalfNum_Solution(int[] array) {
        int count = 0, win = 0;
        for (int temp : array) {
            if (count == 0) {
                win = temp;
                count = 1;
            } else {
                if (win == temp) {
                    count++;
                } else {
                    count--;
                }
            }
        }
        return win;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(MoreThanHalfNum_Solution(array));
    }
}
