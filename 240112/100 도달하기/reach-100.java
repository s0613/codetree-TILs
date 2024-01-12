import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int one = 1;
        int two = sc.nextInt();
        System.out.print(one + " " + two + " ");
        while(n < 100){
            n = one + two;
            one = two;
            two = n;
            System.out.print(n + " ");
        }

    }
}