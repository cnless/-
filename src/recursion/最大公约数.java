package recursion;

public class 最大公约数 {
    public static void main(String[] args) {
        int num=最大公约数.gcd(5,10);
        System.out.println(num);

    }
    static int gcd (int m,int n){
        if(n==0) return m;
        return gcd(n,m%n);
    }
}
