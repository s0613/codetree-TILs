import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(num(a,b,c));
    }
    public static int num(int a, int b, int c){
        int min = a;
        if(b < a){
            min = b;
        }
        if(min > c){
            min = c;
        }
        return min;
    }

}