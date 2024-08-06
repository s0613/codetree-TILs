import java.util.*;
class IntWrapper{
    int value;
    public IntWrapper(int value){
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntWrapper aWrapper = new IntWrapper(a);
        IntWrapper bWrapper = new IntWrapper(b);
        modify(aWrapper, bWrapper);
        System.out.print(aWrapper.value + " " + bWrapper.value);
    }
    public static void modify(IntWrapper a, IntWrapper b){
        if(a.value > b.value){
            b.value += 10;
            a.value *= 2;
        }
        else {
            b.value *= 2;
            a.value += 10;
        }
    }
}