import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printN(n);
        System.out.println();
        printRN(n);
    }
    public static void printN(int n){
        if(n == 0){
            return;
        }
        printN(n-1);
        System.out.print(n+ " ");
    }
    public static void printRN(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printRN(n-1);
    }
}