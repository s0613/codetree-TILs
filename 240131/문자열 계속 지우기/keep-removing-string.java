import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        while(A.contains(B)){
            int a = A.indexOf(B);
            A = A.substring(0,a) + A.substring(a+B.length(),A.length());
        }
        System.out.print(A);
    }
}