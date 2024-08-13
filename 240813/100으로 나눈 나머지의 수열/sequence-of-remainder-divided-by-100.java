import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = infact(n);
        System.out.print(sum);
    }
    public static int infact(int n){
        if(n == 1){
            return 2;
        }
        if(n == 2){
            return 4;
        }
        return (infact(n-1) * infact(n-2))%100;
    }

}