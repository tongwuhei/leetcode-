package leetCode.jzoffer.t40;

/**
 * @author chj
 * @date 2021/8/19 9:58
 */
public class t36 {


    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode l1 = pHead1;
        ListNode l2 = pHead2;
        while (l1 != l2) {
            l1 = l1 == null ? pHead2 : l1.next;
            l2 = l2 == null ? pHead1 : l2.next;
        }
        return l1;
    }

    public static void main(String[] args) {

    }
}
