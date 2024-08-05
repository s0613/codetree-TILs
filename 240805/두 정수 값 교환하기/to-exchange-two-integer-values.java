import java.util.Scanner;
class IntWrapper{
        int value;
        public IntWrapper(int value){
            this.value = value;
        }
    }
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        IntWrapper nWrapper = new IntWrapper(n);
        IntWrapper mWrapper = new IntWrapper(m);
        swap(nWrapper,mWrapper);
        System.out.print(nWrapper.value + " " + mWrapper.value);
    }
    public static void swap(IntWrapper n, IntWrapper m){
        int temp = n.value;
        n.value = m.value;
        m.value = temp;
    }

}