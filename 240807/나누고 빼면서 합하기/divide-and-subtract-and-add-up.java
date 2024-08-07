import java.util.Scanner;
public class Main {
    public static int sum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        test(arr, m);
        System.out.print(sum);
    }
    public static void test(int[] arr,int m){
        for(int i = m; i >= 1;){
            sum += arr[i-1];
            if(i%2 == 0){
                i /= 2;
            }else i -= 1;
        }
    }
}