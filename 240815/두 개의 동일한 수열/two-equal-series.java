import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i = 0; i < n; i++){
            if(arr[i] != arr2[i]){
                System.out.print("No");
                break;
            }
            else if(i == n-1){
                System.out.print("Yes");
            }
        }
    }
}