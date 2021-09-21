package leetCode.ty;

/**
 * @author chj
 * @date 2021/9/14 20:21
 */
public class t2 {

    public class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeNthFromEnd(ListNode ListNode, int n) {
        // write code here
        ListNode head = ListNode;
        int k = 1;
        while (ListNode.next!=null){
            k++;
            ListNode = ListNode.next;
        }
        n = k-n+1;
        ListNode head1 = head;
        int i = 1;
        if (n == 1) {
            return ListNode.next;
        }
        while (true) {
            i++;
            if (n == i) {
                head1.next = head1.next.next;
                break;
            }
            head1 = head1.next;
        }
        return head;
    }

}
