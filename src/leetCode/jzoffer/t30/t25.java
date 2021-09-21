package leetCode.jzoffer.t30;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chj
 * @date 2021/8/13 9:47
 */
public class t25 {

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        //新的链表p
        RandomListNode p = new RandomListNode(pHead.label);
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        map.put(pHead, p);

        //移动的指针，
        RandomListNode temp = p;
        RandomListNode cur = pHead;

        while (cur != null) {
            if (cur.next != null) {
                if (!map.containsKey(cur.next)) {
                    temp.next = new RandomListNode(cur.next.label);
                    map.put(cur.next, temp);
                }
            }
            if (cur.random != null) {
                if (!map.containsKey(cur.random)) {
                    temp.random = new RandomListNode(cur.random.label);
                    map.put(cur.random, temp);
                }
            }
            temp = temp.next;
            cur = cur.next;
        }
        return p;

    }

    public static void main(String[] args) {

    }
}
