import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(yesOrNo(n)){
            System.out.print("Yes");
        }
        else System.out.print("No");
    }
    public static boolean yesOrNo(int n){
        boolean yes = false;
        if(n % 2 == 0 && ((n % 10) + (n / 10)) % 5 == 0){
            yes = true;
        }
        return yes;
    }
}