package leetCode.jzoffer.t20;

/**
 * @author chj
 * @date 2021/6/19 16:40
 */
public class t15 {
    static {
        System.out.println("hello");
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode ReverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode next;
        while (head!= null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode node = ReverseList(node1);
        System.out.println(node.val);

    }
}
