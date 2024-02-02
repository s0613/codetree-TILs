import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String ab = a.concat(b);
        String ba = b.concat(a);
        int c = Integer.parseInt(ab);
        int d = Integer.parseInt(ba);
        System.out.print(c+d);
    }
}