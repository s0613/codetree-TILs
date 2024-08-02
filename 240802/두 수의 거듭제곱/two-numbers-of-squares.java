import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printAB(a,b);
    }
    public static void printAB(int a, int b){
        int n = a;
        for(int i =1; i < b; i++){
            n *= a;
        }
        System.out.print(n);
    }
}