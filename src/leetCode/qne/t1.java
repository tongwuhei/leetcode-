package leetCode.qne;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * @author chj
 * @date 2021/9/14 15:20
 */
public class t1 {

    /* Write Code Here */
    public String solution(int[] d) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < d.length; i++) {
            if (d[i] % 3 == 0) {
                list1.add(d[i]);
            } else {
                list2.add(d[i]);
            }
        }
        int[] array = new int[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            array[i] = list2.get(i);
        }
        Arrays.sort(array);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if ((array[i] + array[j]) % 3 == 0) {
                    if (map.containsKey(i)) {
                        break;
                    }
                    if ((!map.containsKey(i)) && (!map.containsKey(j))) {
                        map.put(i, 1);
                        map.put(j, 2);
                        list1.add(array[i]);
                        list1.add(array[j]);
                        break;
                    }
                }
            }
        }
        int[] res = new int[list1.size()];
        for (int i = 0; i < list1.size(); i++) {
            res[i] = list1.get(i);
        }
        Arrays.sort(res);
        StringBuilder builder = new StringBuilder("");
        for (int i = res.length - 1; i >= 0; i--) {
            builder.append(res[i]);
        }
        return builder.toString();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String res;

        int _d_size = 0;
        _d_size = Integer.parseInt(in.nextLine().trim());
        int[] _d = new int[_d_size];
        int _d_item;
        for (int _d_i = 0; _d_i < _d_size; _d_i++) {
            _d_item = Integer.parseInt(in.nextLine().trim());
            _d[_d_i] = _d_item;
        }

        res = new t1().solution(_d);
        System.out.println(res);
    }
}