package leetCode.jzoffer.t20;

/**
 * @author chj
 * @date 2021/6/20 18:38
 */
public class t18 {


    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode node = null;


    public TreeNode Mirror(TreeNode pRoot) {
        if (pRoot == null) {
            return null;
        }

        if (pRoot.left != null || pRoot.right != null) {
            node = pRoot.left;
            pRoot.left = pRoot.right;
            pRoot.right = node;
        }
        if (pRoot.left != null) {
            Mirror(pRoot.left);
        }
        if (pRoot.right != null) {
            Mirror(pRoot.right);
        }
        return pRoot;
    }
}
