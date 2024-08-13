import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = infact(n,0);
        System.out.print(cnt);
    }
    public static int infact(int n, int cnt){
        if(n == 1){
            return cnt;
        }
        if(n % 2 == 0){
            return infact(n/2, cnt+1);
        }else return infact(n*3+1, cnt+1);
    }
}