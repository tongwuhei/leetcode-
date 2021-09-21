package leetCode.aqiyi;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author chj
 * @date 2021/9/12 15:31
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        String[] str = ss.substring(1, ss.length() - 1).split(",");
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int res = 0;
        for (int i = 0; i < str.length; i = i+2) {
            Character s1 = str[i].charAt(1);
            Character s2 = str[i+1].charAt(0);
            if (!map1.containsKey(s1)){
                map1.put(s1,1);
                if (!map2.containsKey(s2)){
                    map2.put(s2,1);
                }else {
                    res++;
                }
            }else {
                res++;
            }
        }
        System.out.println(res);
    }
}
