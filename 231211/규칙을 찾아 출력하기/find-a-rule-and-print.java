import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int k = 0; k < i; k++){
                System.out.print("* ");
            }

            for(int j = i; j < n; j++){
                if(i == 0 || j == n-1){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}