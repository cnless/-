package backtracking;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @Author dsk
 * @Date 2021/8/20 17:04
 */
//leetcode 216
public class 组合总和3 {
    static List<List<Integer>> result=new ArrayList<>();
    static Deque<Integer> path=new ArrayDeque<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        result.clear();
        path.clear();
        backTracking(n,k,0,1);
        return result;
    }
    public static void backTracking(int targetSum,int k,int sum,int startIndex){
        if (sum>targetSum) return;
        if(path.size()==k){
            if(sum==targetSum) result.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i <=9 ; i++) {
            sum+=i;
            path.addLast(i);
            backTracking(targetSum,k,sum,i+1);
            sum-=i;
            path.removeLast();
        }
    }
}
