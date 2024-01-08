import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while(m != 0){
            int n = sc.nextInt();
            int sum = 0;
            if(n == 1){
                System.out.print(0);
                continue;
            }
            while(n != 1){
                if(n % 2 == 1){
                    n = n*3 + 1;
                    sum++;
                }else {
                    n /= 2;
                    sum++;
                    }
            }
            m--;
            System.out.println(sum);
        }
    }
}