import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 64;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x++;
                System.out.print((char)x);
            }
            System.out.println();
        }
    }
}