import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                for(int j = cnt; j < n; j++){
                    System.out.print("* ");
                }
                System.out.println();
                cnt++;
                continue;
            }
            for(int k = 0; k < i/2+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        cnt--;
        for(int i = n; i > 0; i--){
            if(i % 2 == 0){
                for(int j = cnt; j < n; j++){
                    System.out.print("* ");
                }
                System.out.println();
                cnt--;
                continue;
            }
            for(int k = 0; k < i/2+1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}