import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int r = sc.nextInt();
        for(int i = 1; i <= c; i++){
            for(int j = 1; j <= r; j++){
                System.out.printf("%d ", i*j);
            }
            System.out.println();
        }

    }
}