import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            for(int j = i; j < n-1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i > 1; i--){
            for(int j = i; j < n+1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k > 2*n - (2*i) - 3; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}