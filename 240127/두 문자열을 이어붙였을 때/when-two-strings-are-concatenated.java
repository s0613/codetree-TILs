import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String ab = a.concat(b);
        String ba = b.concat(a);
        if(ab.equals(ba)){
            System.out.print("true");
        }else System.out.print("false");
    }
}