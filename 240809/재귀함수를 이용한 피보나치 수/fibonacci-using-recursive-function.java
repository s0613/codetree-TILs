import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = fibo(n);
        System.out.print(sum);
    }
    public static int fibo(int n){
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }
}