import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n, 1);
    }
    public static void fact(int n, int cnt){
        if(n == 1){
            System.out.print(cnt-1);
            return;
        }
        if(n % 2 == 0){
            fact(n/2, cnt+1);
        }
        else fact(n/3, cnt+1);
    }
}