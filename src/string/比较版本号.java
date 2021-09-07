package string;

/**
 * @Author dsk
 * @Date 2021/9/6 11:37
 */
//leetcode 165
public class 比较版本号 {
    public int compareVersion(String version1, String version2) {
        int l1=version1.length(),l2=version2.length();
        int i=0,j=0;
        while (i<l1||j<l2){
            int x=0;
            for(;i<l1&&version1.charAt(i)!='.';i++){
                x=x*10+version1.charAt(i)-'0';
            }
            i++;
            int y=0;
            for(;j<l2&&version2.charAt(j)!='.';j++){
                y=y*10+version2.charAt(j)-'0';
            }
            j++;
            if(x>y){
                return 1;
            }
            if(x<y){
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int x=10;
        x=x+'9'-'0';
        System.out.println(x);
    }
}
