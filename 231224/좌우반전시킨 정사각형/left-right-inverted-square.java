import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int k = 4*i;
            for(int j = 0; j < n; j++){
                System.out.printf("%d ", k - j*i);
            }
            System.out.println();
        }
    }
}