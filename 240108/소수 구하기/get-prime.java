import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 2; i <= n; i++){
            int a = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0) a++;
            }
            if(a == 2) System.out.print(i+" ");
        }
    }
}