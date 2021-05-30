package leetCode.med;

import java.util.Arrays;

/**
 * 魔术排列
 *
 * @author chj
 * @date 2021/4/18 16:18
 */
public class test1 {

    public static boolean isMagic(int[] target) {
        int[] num;
        num = target;
        Arrays.sort(num);
        int i;
        for ( i = 0; i < target.length; i++) {
            if (num[i] != target[i]){
                break;
            }
        }
        int k = i;



        return true;
    }


    public static void main(String[] args) {

    }
}
