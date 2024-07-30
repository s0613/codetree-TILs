import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        printNM(n,m);
    }
    public static void printNM(int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}