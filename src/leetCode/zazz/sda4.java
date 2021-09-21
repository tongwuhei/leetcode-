package leetCode.zazz;

import java.util.HashMap;

/**
 * @author chj
 * @date 2021/8/25 16:55
 */
public class sda4 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        map.put(head, 1);
        ListNode node = null;
        while (head.next != null) {
            node = head.next;
            if (map.containsKey(node)){
                return true;
            }else {
                map.put(node,1);
            }
        }
        return false;
    }
}
