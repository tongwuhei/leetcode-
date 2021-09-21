package leetCode.jzoffer.t20;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chj
 * @date 2021/6/19 16:05
 */
public class t14 {

    public class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindKthToTail(ListNode pHead, int k) {
        int i = 1, j = 1;
        ListNode node = pHead;
        while (pHead.next != null) {
            i++;
            if (i>=k){
                j++;
                node = node.next;
            }
            pHead = pHead.next;
        }
        if(i<=k){
            return new ListNode(1);
        }
        return node;
    }
}
