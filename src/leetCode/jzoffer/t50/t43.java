package leetCode.jzoffer.t50;

/**
 * @author chj
 * @date 2021/8/26 10:50
 */
public class t43 {

    public static String LeftRotateString(String str, int n) {
        if (str.length() == 0) {
            return str;
        }
        StringBuilder builder = new StringBuilder(str);
        String ss = builder.substring(0, n);
        builder.delete(0, n);
        builder.append(ss);
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(LeftRotateString("abcXYZdef", 3));
    }
}
