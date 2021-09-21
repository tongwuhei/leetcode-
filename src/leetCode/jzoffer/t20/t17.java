package leetCode.jzoffer.t20;


/**
 * @author chj
 * @date 2021/6/20 16:36
 */
public class t17 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    /**
     * 判断是否为字节构
     */
    public boolean judge(TreeNode root, TreeNode aimTree) {
        //子结构循环结束，匹配成功
        if (aimTree == null) {
            return true;
        }
        //左树循环结束，匹配失败
        if (root == null) {
            return false;
        }
        //继续判断左右孩子树
        if (root.val == aimTree.val) {
            return judge(root.left, aimTree.left) && judge(root.right, aimTree.right);
        } else {
            return false;
        }
    }


    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        //如果两树有一个为空，返回false
        if (root1 == null || root2 == null) {
            return false;
        }
        //如果两树根节点相等，则判断是否为子结构
        if (root1.val == root2.val) {
            if (judge(root1, root2)) {
                return true;
            }
        }
        //查找下一个相等的根节点
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

}
