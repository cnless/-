package tree;

/**
 * @Author dsk
 * @Date 2021/8/12 13:54
 */

public class TreeNode {

        Integer val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(Integer val) { this.val = val; }
        TreeNode(Integer val, tree.TreeNode left, tree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
}
