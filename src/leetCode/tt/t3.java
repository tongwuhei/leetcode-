//package leetCode.tt;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Scanner;
//
///**
// * @author chj
// * @date 2021/9/9 19:47
// */
//public class t3 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] ss = sc.nextLine().split(" ");
//        int n = Integer.parseInt(ss[0]);
//        int m = Integer.parseInt(ss[1]);
//        String str = sc.nextLine();
//        char[] chars = str.toCharArray();
//        int k, v;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < m; i++) {
//            String[] s1 = sc.nextLine().split(" ");
//            k = Integer.parseInt(ss[0]);
//            v = Integer.parseInt(ss[1]);
//            map.put(k, v);
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        int index = 0;
//        for (int i = 0; i < n; i++) {
//            if (chars[i] == '1') {
//                index++;
//            } else {
//                list.add(index);
//                index = 0;
//            }
//        }
//        for (int i = 0;i<list.size();i++){
//            int max = map.
//        }
//
//    }
//}
