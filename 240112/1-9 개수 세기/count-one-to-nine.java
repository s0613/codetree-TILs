import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10];
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            arr[temp-1] = temp;
        }
        for(int i = 0; i < 9; i++){
            if(arr[i] == i+1){
                System.out.println("1");
            }else System.out.println("0");
        }
    }
}