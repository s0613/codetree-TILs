import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = fact(n);
        System.out.print(num);
    }
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        return fact(n-1) + n;
    }
}