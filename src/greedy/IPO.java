package greedy;

import java.util.*;

/**
 * @Author dsk
 * @Date 2021/9/8 14:41
 */
//leetcode 502
public class IPO {
    public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new int[]{capital[i], profits[i]});
        }
        Collections.sort(list, (a,b)->a[0]-b[0]);
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b)->b-a);
        int i = 0;
        while (k-- > 0) {
            while (i < n && list.get(i)[0] <= w) q.add(list.get(i++)[1]);
            if (q.isEmpty()) break;
            w += q.poll();
        }
        return w;
    }

    public static void main(String[] args) {
        int k = 3, w = 0;
        int[] profits = {1,2,3}, capital = {0,1,2};
        findMaximizedCapital(k,w,profits,capital);
        List<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(5);
        Collections.sort(arr, Comparator.comparingInt(a -> a));
        System.out.println(arr.toString());
        PriorityQueue<Integer> pq=new PriorityQueue<>((a, b)->b-a);
        pq.add(3);
        pq.add(2);
        pq.add(5);
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
