import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        int sum = 0;
        for(int i = 0; i < 10; i++){
            String a = sc.next();
            arr[i] = a;
            sum += arr[i].length();
        }
        System.out.print(sum);
    }
}