package tree;

/**
 * @Author dsk
 * @Date 2021/8/12 13:28
 */
//求树的最大深度
public class BinaryTreeMaxDepth {
    public static void main(String[] args) {
        Integer[] tree={3,9,20,null,null,15,7};
        TreeNode treeNode = TreeUtils.levelConstruct(tree);
        System.out.println(maxDepth(treeNode));
    }
    public static int maxDepth(TreeNode root) {
        return getMaxDepth(root);
    }
    //递归法
    public static int getMaxDepth(TreeNode root){
        /*if(root==null) return 0;*/
        /*int leftDepth=getMaxDepth(root.left);*/
        /*int rightDepth=getMaxDepth(root.right);*/
        /*return 1+Math.max(leftDepth,rightDepth);*/
        //精简版
        if(root==null) return 0;
        return 1+Math.max(getMaxDepth(root.left),getMaxDepth(root.right));
    }

}
