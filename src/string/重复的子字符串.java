package string;

/**
 * @Author dsk
 * @Date 2021/8/30 15:37
 */
//leetcode 459
public class 重复的子字符串 {
    public boolean repeatedSubstringPattern(String s) {
        if(s.equals("")) return false;
        int[] next=new int[s.length()];
        getNext(next,s);
        int len=s.length();
        if(next[len-1]!=0&&len%(len-(next[len-1]))==0) return true;
        return false;
    }
    public static void getNext(int[] next,String s){
        int j=0;
        next[0]=j;
        for (int i = 1; i < s.length(); i++) {
            while (j>0&&s.charAt(i)!=s.charAt(j)){
                j=next[j-1];
            }
            if(s.charAt(j)==s.charAt(i)){
                j++;
            }
            next[i]=j;
        }
    }
}
