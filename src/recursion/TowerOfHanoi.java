package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        printHanoiTower(4,"A","B","C");
    }
    static void printHanoiTower(int N,String from,String to,String help){
        if(N==1){
            System.out.println("move"+N+"from"+from+"to"+to);
            return;
        }
        if(N>1) {
            printHanoiTower(N - 1, from, help, to);
            System.out.println("move" + N + "from" + from + "to" + to);
            printHanoiTower(N - 1, help, to, from);
        }
    }
}

