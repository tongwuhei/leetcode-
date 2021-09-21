package leetCode.zazz;

import java.util.LinkedList;

/**
 * @author chj
 * @date 2021/8/27 19:53
 */
public class zifuchuanjiema {

    public static String decodeString(String s) {
        //当前字符串
        StringBuilder res = new StringBuilder();
        int multi = 0;
        LinkedList<Integer> stack_int = new LinkedList<>();
        LinkedList<String> stack_string = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                multi = multi * 10 + Integer.parseInt(c + "");
            } else if (c == '[') {
                stack_int.addLast(multi);
                stack_string.addLast(res.toString());
                multi = 0;
                res.delete(0, res.length());
            } else if (c == ']') {
                StringBuilder temp = new StringBuilder();
                int curInt = stack_int.removeLast();
                while (curInt != 0) {
                    temp.append(res);
                    curInt--;
                }
                res = new StringBuilder(stack_string.removeLast() + temp);
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("100[a]"));
    }
}
