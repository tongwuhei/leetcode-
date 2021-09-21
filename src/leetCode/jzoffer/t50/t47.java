package leetCode.jzoffer.t50;

/**
 * @author chj
 * @date 2021/8/28 11:22
 */
public class t47 {

    public static String changespaceto20 (String str) {

        // write code here

        StringBuilder builder = new StringBuilder();
        str.replace(" ","");
        str.replaceAll(" ","20%");

        return str;
    }

    public static void main(String[] args) {
        System.out.println(changespaceto20("a  b    c"));
    }
}
