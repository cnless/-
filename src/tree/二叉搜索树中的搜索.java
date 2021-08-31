package tree;

/**
 * @Author dsk
 * @Date 2021/8/27 15:20
 */
//leetcode 700
public class 二叉搜索树中的搜索 {
    public TreeNode searchBST(TreeNode root, int val) {//递归法
        if(root==null||root.val==val) return root;
        if(root.val>val) return searchBST(root.left,val);
        if (root.val<val) return searchBST(root.right,val);
        return null;
    }
    public TreeNode searchBST2(TreeNode root, int val) {//迭代法
       while (root!=null){
           if(root.val>val) root=root.left;
           else if(root.val<val) root=root.right;
           else return root;
       }
       return null;
    }
}
