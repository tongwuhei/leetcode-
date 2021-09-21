package leetCode.jzoffer.t30;

import java.util.ArrayList;

/**
 * @author chj
 * @date 2021/8/13 9:09
 */
public class t24 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        ArrayList<Integer> path = new ArrayList<>();
        find(root, target, result, path);
        return result;
    }

    void find(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        target = target - root.val;
        if (target < 0) {
            return;
        } else if (target == 0 && root.left == null && root.right == null) {
            result.add(path);
            return;
        }
        find(root.left, target, result, new ArrayList<>(path));
        find(root.right, target, result, new ArrayList<>(path));
    }

    public static void main(String[] args) {
    }
}
