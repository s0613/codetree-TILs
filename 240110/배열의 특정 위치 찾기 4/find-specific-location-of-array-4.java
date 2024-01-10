import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int cnt = 0;
        int a;
        for(int i = 0; i < 10; i++){
            a = sc.nextInt();
            if(a == 0) break;
            if(a % 2 == 0){
                even += a;
                cnt++;
            }
        }
        System.out.print(cnt + " " +even);

    }
}