import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(add(a)/10);
    }
    public static int add(int a){
        int sum = 0;
        for(int i = 1; i <= a; i++){
            sum += i;
        }
        return sum;
    }

}