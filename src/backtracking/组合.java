package backtracking;

import java.util.*;

/**
 * @Author dsk
 * @Date 2021/8/14 19:15
 */
//leetcode77
public class 组合 {
    static List<List<Integer>> result = new LinkedList<>();//存放符合条件结果的集合
    static Deque<Integer> path=new ArrayDeque<>();// 用来存放符合条件结果
    public static void main(String[] args) {
        new 组合().combine(4,2);
    }
    public List<List<Integer>> combine(int n, int k) {
        result.clear();
        path.clear();
        if (k <= 0 || n < k) {
            return result;
        }
        backTracking(n,k,1);
        System.out.println(result.toString());
        return result;
    }
    public static void backTracking(int n, int k, int startIndex){
        if(path.size()==k){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i=startIndex;i<=n;i++){
            path.addLast(i);
            backTracking(n,k,i+1);//递归
            path.removeLast();// 回溯，撤销处理的节点
        }
    }
    //剪枝后
    public static void backTracking2(int n, int k, int startIndex){
        if(path.size()==k){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int i = startIndex; i <= n - (k - path.size()) + 1; i++){//剪枝
            path.addLast(i);
            backTracking(n,k,i+1);//递归
            path.removeLast();// 回溯，撤销处理的节点
        }
    }
}
