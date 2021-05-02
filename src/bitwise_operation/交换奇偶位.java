package bitwise_operation;

public class 交换奇偶位 {
    public static void main(String[] args) {
        int a=9;
        int b=m(a);
        System.out.println(b);
        int c=0b10000000_00000000_00000000_00000000;
        System.out.println(c);
        b=m(c);
        System.out.println(b);
        System.out.println(Integer.toString(b, 2));

    }
    public static int m(int a){
        int even=a&0xaaaaaaaa;
        int odd=a&0x55555555;
        return (even>>1)|(odd<<1);
    }
}
