package tree;

import java.util.Arrays;

/**
 * @Author dsk
 * @Date 2021/8/27 16:12
 */
//leetcode 106
public class 从中序与后序遍历序列构造二叉树 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length==0||postorder.length==0)return null;
        return traversal(inorder,postorder);
    }
    public static TreeNode traversal(int[] inorder, int[] postorder){
        if (postorder.length==0) return null;
        int rootValue=postorder[postorder.length-1];
        TreeNode root=new TreeNode(rootValue);
        if (postorder.length==1) return root;//叶子节点
        int delimiterIndex;//切割点
        for (delimiterIndex=0;delimiterIndex<inorder.length;delimiterIndex++){
            if(inorder[delimiterIndex]==rootValue) break;
        }
        //copyOfRange是左闭右开区间
        int[] leftInOrder= Arrays.copyOfRange(inorder,0,delimiterIndex);
        int[] rightInOrder= Arrays.copyOfRange(inorder,delimiterIndex+1,inorder.length);
        int[] leftPostOrder= Arrays.copyOfRange(postorder,0,leftInOrder.length);
        int[] rightPostOrder= Arrays.copyOfRange(postorder,leftPostOrder.length,leftPostOrder.length+rightInOrder.length);
        System.out.println("中左"+Arrays.toString(leftInOrder));
        System.out.println("中右"+Arrays.toString(rightInOrder));
        System.out.println("后左"+Arrays.toString(leftPostOrder));
        System.out.println("后右"+Arrays.toString(rightPostOrder));
        root.left=traversal(leftInOrder,leftPostOrder);
        root.right=traversal(rightInOrder,rightPostOrder);
        return root;
    }
    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] postOrder= {9,15,7,20,3};
        new 从中序与后序遍历序列构造二叉树().buildTree(inorder,postOrder);
    }
    //不分割数组，使用索引
    public static TreeNode traversal2(int[] inorder,int[] postorder,int inorderBegin,int inorderEnd,int postorderBegin,int postorderEnd){
        if (postorderBegin==postorderEnd) return null;
        int rootValue=postorder[postorderEnd-1];
        TreeNode root=new TreeNode(rootValue);
        if(postorderEnd-postorderBegin==1) return root;
        int delimiterIndex;//切割点
        for (delimiterIndex=inorderBegin;delimiterIndex<inorderEnd;delimiterIndex++) {
            if (inorder[delimiterIndex]==rootValue) break;
        }
        int leftInorderBegin=inorderBegin;
        int leftInorderEnd=delimiterIndex;
        int rightInorderBegin=delimiterIndex+1;
        int rightInorderEnd=inorderEnd;

        int leftPostorderBegin=postorderBegin;
        int leftPostorderEnd=postorderBegin+delimiterIndex-inorderBegin;
        int rightPostorderBegin=leftPostorderEnd;
        int rightPostEnd=postorderEnd-1;

        root.left=traversal2(inorder,postorder,leftInorderBegin,leftInorderEnd,leftPostorderBegin,leftPostorderEnd);
        root.right=traversal2(inorder,postorder,rightInorderBegin,rightInorderEnd,rightPostorderBegin,rightPostEnd);

        return root;
    }
}
