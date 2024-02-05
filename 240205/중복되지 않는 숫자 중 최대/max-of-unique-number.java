import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int num = 0;

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            arr[i] = temp;
        }

        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }else if(max == arr[i]){
                num++;
                if(num == n/2){
                    max = -1;
                    break;
                }
                int idx = 0;
                for(int j : arr){
                    if(j != arr[i]){
                        arr[idx++] = j;
                    }
                }
                i = 0;
            }
        }
        System.out.print(max);
    }
}