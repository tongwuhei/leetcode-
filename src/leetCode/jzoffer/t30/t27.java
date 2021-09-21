package leetCode.jzoffer.t30;

import java.util.ArrayList;

/**
 * @author chj
 * @date 2021/8/13 10:58
 */
public class t27 {

    public static ArrayList<String> Permutation(String str) {
        StringBuilder builder = new StringBuilder(str);
        ArrayList<String> result = per(builder);
        return result;
    }

    static ArrayList<String> per(StringBuilder str) {
        ArrayList<String> result = new ArrayList<>();
        if (str.length() <= 1) {
            result.add(str.toString());
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || str.charAt(i) != str.charAt(0)) {
                    char temp = str.charAt(i);
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.println(Permutation(str));
    }
}
