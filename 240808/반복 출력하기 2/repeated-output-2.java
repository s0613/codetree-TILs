import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printN(n);
    }
    public static void printN(int n){
        if(n == 0){
            return;
        }
        printN(n-1);
        System.out.println("HelloWorld");
    }
}