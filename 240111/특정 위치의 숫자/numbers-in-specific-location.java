import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            int temp = sc.nextInt();
            arr[i] = temp;
        }
        System.out.print(arr[2] + arr[4]+arr[9]);
    }
}