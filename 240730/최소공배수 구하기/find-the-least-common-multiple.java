import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printNM(n,m);
    }
    public static void printNM(int n, int m){
        int k = n > m ? m : n;
        while(true){
            if(k%n == 0 && k % m == 0){
                break;
            }
            k++;
        }
        System.out.print(k);
    }
}