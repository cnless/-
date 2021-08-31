package tree;

import java.util.ArrayDeque;
import java.util.Collections;

/**
 * @Author dsk
 * @Date 2021/8/31 12:04
 */

public class 翻转二叉树 {
    //dfs
    /*
    * 前后序都行但中序不行，因为中序是左孩子先交换孩子，
    * 然后是根交换孩子，此时新的右孩子是原来的左孩子，
    * 再交换右孩子的孩子还是原来的左孩子的孩子进行交换
    * */
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return null;
        invertTree(root.left);
        invertTree(root.right);
        swapChildren(root);
        return root;

    }
    private void swapChildren(TreeNode root){
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
    }
    //bfs
    public TreeNode invertTree2(TreeNode root) {
        if (root==null) return null;
        ArrayDeque<TreeNode> deque=new ArrayDeque<>();
        deque.offer(root);
        while (!deque.isEmpty()){
            int size=deque.size();
            while (size-->0){
                TreeNode node=deque.poll();
                swapChildren(node);
                if (node.left!=null) deque.offer(node.left);
                if (node.right!=null) deque.offer(node.right);
            }
        }
        return root;
    }
}
