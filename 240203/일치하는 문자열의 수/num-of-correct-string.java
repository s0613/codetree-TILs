import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String A = sc.next();
        int cnt = 0;
        for(int i = 0; i < n; i++){
            String a = sc.next();
            if(A.equals(a)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}