import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.print(a.contains("ee") ? "Yes " : "No ");
        System.out.print(a.contains("ab") ? "Yes" : "No");
    }
}