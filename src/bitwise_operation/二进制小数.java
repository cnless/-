package bitwise_operation;

public class 二进制小数 {
    public static void main(String[] args) {
        double d=0.625;
        StringBuilder sb=new StringBuilder("0.");
        while (d>0){
            d=d*2;
            if(d>=1){
                d=d-1;
                sb.append(1);
            }else {
                sb.append(0);
            }
            if (sb.length()>34){
                System.out.println("ERROR");
                return;
            }
        }
        System.out.println(sb);
    }
}
