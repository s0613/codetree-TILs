import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int num = infact(0,arr);
        System.out.print(num);
    }
    public static int infact(int num ,int[] arr){
        
        if(arr[num] % arr[num+1] != 0){
            arr[num] *= arr[num+1];
            arr[num+1] = arr[num];
            if(arr.length-1 == num+1){
                return arr[num];
            }
            return infact(num+1, arr);
        }
        else {
            arr[num + 1] = arr[num]; 
            if(arr.length-1 == num+1){
                return arr[num];
            }
            return infact(num+1, arr);
        }
        
    }
}