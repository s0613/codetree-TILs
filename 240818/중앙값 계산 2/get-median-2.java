import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 1; i <= n; i += 2){
            int[] arr2 = new int[i];
            for(int j = 0; j < i; j++){
                arr2[j] = arr[j];
            }
            Arrays.sort(arr2);
            System.out.print(arr2[i/2] + " "); 
            }
    }
}