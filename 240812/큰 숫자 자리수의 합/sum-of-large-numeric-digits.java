import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a*b*c;
        int n = infact(sum);
        System.out.print(n);
    }
    public static int infact(int n){
        if(n < 10){
            return n;
        }
        return infact(n/10) + n%10;
    }
}