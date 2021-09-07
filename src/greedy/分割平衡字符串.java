package greedy;

/**
 * @Author dsk
 * @Date 2021/9/7 14:32
 */
//leetcode 1221
public class 分割平衡字符串 {
    public int balancedStringSplit(String s) {
        int n=0;
        int result=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='R'){
                n++;
            }
            if (s.charAt(i)=='L') n--;
            if(n==0){
                result++;
            }
        }
        return result;
    }
}
