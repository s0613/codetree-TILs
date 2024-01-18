import java.util.Scanner;
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
            if(max < temp){
                max = temp;
                num = i;
            }
        }
        System.out.print(num+1 + " ");
        int num2 = num;
        for(int i = 0; i < num2; i++){
            max = 0;
            for(int j = 0; j < num; j++){
                if(max < arr[j]){
                    max = arr[j];
                    num2 = j;
                }
            }
            System.out.print(num2+1 + " ");
            num = num2;
        }
    }
}