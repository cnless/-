package greedy;

import java.util.Arrays;

/**
 * @Author dsk
 * @Date 2021/8/15 13:23
 */
//leetcode 455
public class 分发饼干 {
    public static void main(String[] args) {
        int[] g={1,2,3},s={1,1};
        System.out.println(new 分发饼干().findContentChildren(g, s));
    }
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index=s.length-1;
        int result=0;
        for (int i=g.length-1;i>=0;i--){
            if (index>=0&&s[index]>=g[i]){
                index--;
                result++;
            }
        }
        return result;

    }
}
