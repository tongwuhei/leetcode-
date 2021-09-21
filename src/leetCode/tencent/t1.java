package leetCode.tencent;

/**
 * 生成格雷码
 * <p>
 * 描述：
 * 在一组数的编码中，若任意两个相邻的代码只有一位二进制数不同， 则称这种编码为格雷码(Gray Code)，请编写一个函数，使用递归的方法生成N位的格雷码。
 * 给定一个整数n，请返回n位的格雷码，顺序为从0开始。
 *
 * @author chj
 * @date 2021/6/7 18:59
 */
public class t1 {

    public static String[] getGray(int n) {
        //开辟一个长度为2的n次方的字符串数组
        String[] grays = new String[(int) Math.pow(2, n)];
        if (n == 1) {
            grays[0] = "0";
            grays[1] = "1";
            return grays;
        } else {
            String[] result = getGray(n - 1);
            for (int i = 0; i < result.length; i++) {
                grays[i] = "0" + result[i];
                grays[grays.length - 1 - i] = "1" + result[i];
            }
        }
        return grays;
    }

    public static void main(String[] args) {
        getGray(3);
    }
}
