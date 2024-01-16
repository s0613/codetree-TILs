import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            int temp = sc.nextInt();
            if(temp == 2){
                cnt++;
            }
            if(cnt == 3){
                System.out.print(i);
                break;
            }
        }
    }
}