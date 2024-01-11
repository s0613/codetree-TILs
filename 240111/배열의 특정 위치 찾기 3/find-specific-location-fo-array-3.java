import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n = 0;
        for(int i = 0; i < 100; i++){
            int temp = sc.nextInt();
            arr[i] = temp;
            n++;
            if(temp == 0){
                break;
            }
        }
        System.out.print(arr[n-2]+arr[n-3]+arr[n-4]);
    }
}