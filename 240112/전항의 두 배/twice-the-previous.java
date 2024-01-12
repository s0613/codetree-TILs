import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int[] arr = new int[10];
        arr[0] = one;
        arr[1] = two;
        for(int i = 2; i < 10; i++){
            arr[i] = arr[i-1] + arr[i-2] * 2; 
        }
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}