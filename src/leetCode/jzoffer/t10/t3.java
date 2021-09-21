package leetCode.jzoffer.t10;

import java.util.ArrayList;

/**
 * @author chj
 * @date 2021/6/5 17:32
 */
public class t3 {

    ArrayList<Integer> list = new ArrayList<>();
    public  ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,listNode.val);
        while (listNode.next != null) {
            list.add(0, listNode.next.val);
            listNode = listNode.next;
        }
        return list;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
//        System.out.println(printListFromTailToHead(l1));
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
