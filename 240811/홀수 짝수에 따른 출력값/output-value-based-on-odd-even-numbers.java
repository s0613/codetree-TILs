import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        
        sum = test2n(n);
        System.out.print(sum);
    }
    public static int test2n(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1) return 1;

        
        return test2n(n-2) + n;
        
    }
}