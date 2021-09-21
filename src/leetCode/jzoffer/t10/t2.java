package leetCode.jzoffer.t10;

/**
 * @author chj
 * @date 2021/6/5 17:17
 */
public class t2 {

    public static String replaceSpace(String s) {
        return s.replaceAll(" ","%20");
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We Are Happy"));
    }
}
