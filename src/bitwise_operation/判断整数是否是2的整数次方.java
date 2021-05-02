package bitwise_operation;

import java.util.Scanner;

public class 判断整数是否是2的整数次方 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(((num-1)&num)==0){
            System.out.println("是2的整数次方");
        }else{
            System.out.println("不是2的整数次方");
        }
    }
}
