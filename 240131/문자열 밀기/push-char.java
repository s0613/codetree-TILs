import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.substring(1,str.length()) + str.charAt(0);
        System.out.print(str);
    }
}