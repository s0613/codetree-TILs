import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int a;
        int cnt = 0;
        for(int i = 0; i < 10; i++){
            a = sc.nextInt();
            if(a == 0) break;
            sum += a;
            cnt++;
        }
        System.out.printf("%d %.1f",(int)sum,sum/cnt);
    }
}