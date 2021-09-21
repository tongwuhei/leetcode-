package leetCode.BinaryTree;

/**
 * @author chj
 * @date 2021/9/16 20:45
 * <p>
 * 104.最大深度
 */
public class t1 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 0;
        }
        return 1+ Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
