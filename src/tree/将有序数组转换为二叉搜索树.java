package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author dsk
 * @Date 2021/8/27 15:46
 */
//leetcode 108
public class 将有序数组转换为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return traversal(nums,0,nums.length-1);
    }
    //递归法
    public static TreeNode traversal(int[] nums,int left,int right){
        if(left>right) return null;
        int mid=left+((right-left)>>1);//防止数值溢出的写法
        TreeNode root=new TreeNode(nums[mid]);
        root.left=traversal(nums,left,mid-1);
        root.right=traversal(nums,mid+1,right);
        return root;
    }
    //迭代法
    public TreeNode sortedArrayToBST2(int[] nums) {
        if (nums.length==0) return null;
        TreeNode root=new TreeNode(0);
        Queue<TreeNode> nodeQ=new LinkedList<>();
        Queue<Integer> leftQ=new LinkedList<>();
        Queue<Integer> rightQ=new LinkedList<>();
        nodeQ.add(root);
        leftQ.add(0);
        rightQ.add(nums.length-1);

        while (!nodeQ.isEmpty()){
            TreeNode curNode=nodeQ.poll();
            int left=leftQ.poll();
            int right=rightQ.poll();
            int mid=left+((right-left)>>1);//防止数值溢出的写法
            curNode.val=nums[mid];
            if(left<=mid-1){
                curNode.left=new TreeNode(0);
                nodeQ.add(curNode.left);
                leftQ.add(left);
                rightQ.add(mid-1);
            }
            if(right>=mid+1){
                curNode.right=new TreeNode(0);
                nodeQ.add(curNode.right);
                leftQ.add(mid+1);
                rightQ.add(right);
            }
        }
        return root;
    }
}
