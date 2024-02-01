import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = (int)sc.next().charAt(0);
        int b = (int)sc.next().charAt(0);
        System.out.print(a+b + " ");
        int c = a-b > 0 ? a-b : b-a;
        System.out.printf("%d",c);
    }
}