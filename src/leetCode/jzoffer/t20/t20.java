package leetCode.jzoffer.t20;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author chj
 * @date 2021/6/20 20:35
 */
public class t20 {

    static ArrayList<Integer> stack = new ArrayList<>();

    public void push(int node) {

        stack.add(node);
    }

    public void pop() {
        stack.remove(stack.size() - 1);
    }

    public int top() {
        return stack.get(stack.size() - 1);
    }

    public int min() {
        return Collections.min(stack);
    }
}
