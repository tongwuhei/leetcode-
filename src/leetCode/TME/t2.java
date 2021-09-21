package leetCode.TME;

/**
 * @author chj
 * @date 2021/9/16 19:08
 */
public class t2 {

    public static String maxLexicographical(String num) {
        // write code here
        StringBuilder str = new StringBuilder(num);
        int i = 0;
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0'){
                break;
            }
        }
        for (int j = i;j<str.length();j++){
            if (str.charAt(j) == '0'){
                str.setCharAt(j,'1');
            }else {
                break;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(maxLexicographical("1001"));
    }
}
