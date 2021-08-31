package tree;

/**
 * @Author dsk
 * @Date 2021/8/27 18:43
 */

public class 从前序与中序遍历序列构造二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0||inorder.length==0) return null;
        return traversal(preorder,inorder,0,inorder.length,0,preorder.length);
    }

    public static TreeNode traversal(int[] preorder, int[] inorder,int inorderBegin,int inorderEnd,int preorderBegin,int preorderEnd) {
        if (preorderBegin == preorderEnd) return null;
        int rootValue = preorder[preorderBegin];
        TreeNode root = new TreeNode(rootValue);
        if((preorderEnd-preorderBegin)==1) return root;
        int delimiterIndex;
        for (delimiterIndex = inorderBegin; delimiterIndex < inorderEnd; delimiterIndex++) {
            if (inorder[delimiterIndex] == rootValue) break;
        }
        int leftInorderBegin = inorderBegin;
        int leftInorderEnd = delimiterIndex;
        int rightInorderBegin = delimiterIndex + 1;
        int rightInorderEnd = inorderEnd;

        int leftPreorderBegin = preorderBegin + 1;
        int leftPreorderEnd = leftPreorderBegin + delimiterIndex - inorderBegin;
        int rightPreorderBegin = leftPreorderEnd;
        int rightPreorderEnd = preorderEnd;

        root.left = traversal(preorder, inorder, leftInorderBegin, leftInorderEnd, leftPreorderBegin, leftPreorderEnd);
        root.right = traversal(preorder, inorder, rightInorderBegin, rightInorderEnd, rightPreorderBegin, rightPreorderEnd);

        return root;
    }
}
