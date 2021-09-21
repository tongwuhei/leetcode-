package leetCode.zazz;

/**
 * 替换字符串
 *
 * @author chj
 * @date 2021/5/10 20:26
 */
public class test1 {
    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        s = s.replace(" ", "%20");
        return s;
    }

    public static void main(String[] args) {

    }
}
