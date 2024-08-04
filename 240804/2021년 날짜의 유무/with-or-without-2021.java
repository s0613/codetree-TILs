import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        testInput(M, N);
    }
    public static void testInput(int m, int n){
        if(m == 2){
            if(n > 28){
                System.out.print("No");
            }else System.out.print("Yes");
        }else{
            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
                if(n > 31){
                    System.out.print("No");
                }else System.out.print("Yes");
            }
            else if(m <13){
                if(m > 30){
                    System.out.print("No");
                }else System.out.print("Yes");
            }else System.out.print("No");
        }
    }
}