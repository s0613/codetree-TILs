import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printNM(n,m);
    }
    public static void printNM(int n, int m){
        int k = 1;
        int min = n > m ? m : n;
        for(int i = 1; i <= min; i++){
            if(n % i == 0 && m % i == 0){
                k = i;
            }
        }
        System.out.print(k);
    }
}