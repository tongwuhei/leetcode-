package leetCode.jzoffer.t30;

import java.util.Stack;

/**
 * @author chj
 * @date 2021/6/21 19:49
 */
public class t21 {
    public static boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int popIndex = 0;
        for (int i = 0; i < popA.length; i++) {
            stack.push(pushA[i]);
            while (!stack.isEmpty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushA = new int[]{1, 2, 3, 4, 5};
        int[] pushB = new int[]{4, 5, 3, 2, 1};
        System.out.println(IsPopOrder(pushA, pushB));
    }
}
