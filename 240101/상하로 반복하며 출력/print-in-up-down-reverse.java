import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = n;
        for(int i = 1; i <= n; i++){
            for(int k = 0; k < n; k++){
                if(k % 2 == 0){
                    System.out.print(i);
                }else System.out.print(cnt);
            }
            System.out.println();
            cnt--;
        }
    }
}