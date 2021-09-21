package leetCode.TME;

/**
 * @author chj
 * @date 2021/9/16 18:54
 */
public class t1 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode cyclicShiftTree(TreeNode root, int k) {
        // write code here
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        return root;
    }
}
