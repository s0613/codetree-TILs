import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int c = a.indexOf(b);
        if(c == -1) System.out.print("No");
        else
        System.out.print(c);
    }
}