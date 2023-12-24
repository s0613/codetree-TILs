import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n; j++){
                cnt = cnt + 2;
                if(cnt >8) cnt = 2;
                System.out.printf("%d ", cnt);
            }
            System.out.println();
        }
    }
}