package leetCode.jzoffer.t30;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chj
 * @date 2021/8/13 10:19
 */
public class t26 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        List<TreeNode> nodes = new ArrayList<>();
        mid(pRootOfTree, nodes);
        return result(nodes);
    }

    //中序遍历
    public void mid(TreeNode node, List<TreeNode> list) {
        if (node.left != null) {
            mid(node.left, list);
        }
        list.add(node);
        if (node.right != null) {
            mid(node.right, list);
        }
    }

    //遍历list，修改指针指向
    public TreeNode result(List<TreeNode> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).right = list.get(i + 1);
            list.get(i + 1).left = list.get(i);
        }
        return list.get(0);
    }
}
