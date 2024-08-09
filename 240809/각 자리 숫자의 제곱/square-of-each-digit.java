import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = fact(n);
        System.out.print(sum);
    }
    public static int fact(int n){
        if(n < 10){
            return n*n;
        }
        return fact(n/10) + ((n%10)*(n%10));
    }
}