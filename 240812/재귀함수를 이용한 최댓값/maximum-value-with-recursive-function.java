import java.util.Scanner;
public class Main {
    public static int max = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int maxNum = infact(arr, 0);
        System.out.print(maxNum);
    }
    public static int infact(int[] arr, int n){
        if(arr[n] > max){
            max = arr[n];
        }
        if(arr.length-1 == n){
            return max;
        }
        return infact(arr, n+1);
    }

}