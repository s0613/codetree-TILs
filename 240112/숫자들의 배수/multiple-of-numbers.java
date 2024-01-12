import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int n = sc.nextInt();
        int num = 1;
        while(cnt != 2){
            System.out.print(n*num + " ");
            if(n*num % 5 == 0){
                cnt++;
            }
            num++;
        }
    }
}