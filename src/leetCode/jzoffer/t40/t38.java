package leetCode.jzoffer.t40;

/**
 * @author chj
 * @date 2021/8/19 10:35
 */
public class t38 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return TreeDepth(root.left) > TreeDepth(root.right) ? TreeDepth(root.left) + 1 : TreeDepth(root.right) + 1;
    }

    public static void main(String[] args) {

    }
}
