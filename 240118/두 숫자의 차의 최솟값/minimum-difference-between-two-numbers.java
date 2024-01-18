import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int a = arr[1] - arr[0];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                int temp = arr[j] - arr[i];
                if(a > temp){
                    a = temp;
                }
            }
        }
        System.out.print(a);
    }
}