package leetCode.jzoffer.t40;

/**
 * @author chj
 * @date 2021/8/19 10:45
 */
public class t39 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public boolean IsBalanced_Solution(TreeNode root) {
        return isBalanced(root) >= 0;
    }

    public int isBalanced(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lh = isBalanced(node.left);
        if (lh < 0) {
            return -1;
        }
        int rh = isBalanced(node.right);
        if (rh < 0) {
            return -1;
        }
        if (Math.abs(lh - rh) <= 1) {
            return Math.max(lh, rh) + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
