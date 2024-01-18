import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int cnt = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(min > arr[i]){
                min = arr[i];
                cnt = i;
            }
        }
        int max = 0;
        for(int i = cnt; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        if(cnt == n){
            System.out.print(0);
        }
        else System.out.print(max-min);
        
    }
}