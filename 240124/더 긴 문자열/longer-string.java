import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = a.length() > b.length() ? a : b;
        if(a.length() == b.length){
            System.out.print("same")
        }else System.out.print(c + " " + c.length());
        
    }
}