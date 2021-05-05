package recursion;

public class 求a的n次幂 {
    public static void main(String[] args) {
        System.out.println(pow0(2,1));

    }
    public static int pow0(int a,int n){
        if(n==0) return 1;
        int res=a;
        int ex=1;
        while ((ex<<1)<=n){
            res=res*res;
            ex<<=1;
        }
        return res*pow0(a,n-ex);
    }
}
