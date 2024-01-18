import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int price = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                if(arr[i] < arr[j] && price < arr[j]-arr[i]){
                    price = arr[j] - arr[i];
                }
            }
        }
        System.out.print(price);
    }
}