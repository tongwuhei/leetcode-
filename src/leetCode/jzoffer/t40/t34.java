package leetCode.jzoffer.t40;

import java.util.HashMap;

/**
 * @author chj
 * @date 2021/8/18 9:19
 */
public class t34 {

    public static int FirstNotRepeatingChar(String str) {
        HashMap<Character,Boolean> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char c:chars){
            if(map.containsKey(c)){
                map.put(c,false);
            }else{
                map.put(c,true);
            }
        }
        for(int i = 0; i < chars.length; i++){
            if(map.get(chars[i])){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("google"));
    }
}
