import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n; i >0; i--){
            for(int k = n; k > i; k--){
                System.out.print("  ");
            }
            for(int j = 0; j < i*2-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++){
            for(int k = n; k > i + 1; k--){
                System.out.print("  ");
            }
            for(int j = 0; j < i*2+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}