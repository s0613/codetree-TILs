import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                num++;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}