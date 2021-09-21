package leetCode.jzoffer.t50;

/**
 * @author chj
 * @date 2021/8/26 11:01
 */
public class t44 {

    public String ReverseSentence(String str) {
        String[] ss = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = ss.length-1; i >=0; i++) {
            builder.append(ss[i]);
            if (i != 0) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {

    }
}
