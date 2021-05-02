package recursion;

import java.util.Scanner;

public class 小白上楼梯 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(f(n));
    }
    public static int f(int n){
        if(n==0) return 1;
        if(n==1) return 1;
        if(n==2) return 2;
        return f(n-1)+f(n-2)+f(n-3);
    }

}
