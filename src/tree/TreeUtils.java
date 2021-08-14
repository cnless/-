package tree;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author dsk
 * @Date 2021/8/12 13:55
 */

public class TreeUtils {
    public static void main(String[] args) {
        Integer[] tree={3,9,20,null,null,15,7};
        TreeNode root=levelConstruct(tree);
        List<List<Integer>> ret=levelOrder(root);
        System.out.println(ret.toString());
    }
    //传入一个层序二叉树数组，构造这棵树，然后返回根节点
    public static TreeNode levelConstruct(Integer[] tree){
        if (tree.length<1) return null;
        TreeNode root=new TreeNode(tree[0]);
        TreeNode temp=root;//保留根节点
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(temp);
        int index=1;
        while (!queue.isEmpty()){
            if (index==tree.length) return root;
            temp=queue.poll();
            temp.left=new TreeNode(tree[index++]);
            if (index==tree.length) return root;
            temp.right=new TreeNode(tree[index++]);
            if (index==tree.length) return root;
            if (temp.left.val!=null) queue.add(temp.left);
            if (temp.right.val!=null) queue.add(temp.right);
        }
        return root;
    }
    //传入根节点，层序遍历这棵树
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<Integer>();
            int currentLevelSize = queue.size();
            for (int i = 1; i <= currentLevelSize; ++i) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ret.add(level);
        }

        return ret;
    }
}
