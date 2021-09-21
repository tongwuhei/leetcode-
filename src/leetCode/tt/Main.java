package leetCode.tt;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author chj
 * @date 2021/9/9 19:02
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        LinkedList<String> list = new LinkedList<>();
        while (n > 0) {
            String str = sc.nextLine();
            if (str.charAt(0) == 'c') {
                String ss = str.split(" ")[1];
                if (!"..".equals(ss)) {
                    list.addLast("\\" + ss);
                } else {
                    if (list.size() != 0) {
                        list.removeLast();
                    }
                }
            } else {
                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < list.size(); i++) {
                    builder.append(list.get(i));
                }
                if (builder.length() == 0) {
                    builder.append("\\");
                }
                System.out.println(builder.toString());
            }
            n--;
        }
    }
}
