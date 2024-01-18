import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }
        int max = 0;
        int obaeak = Integer.MAX_VALUE;
        for(int i = 0; i < 10; i++){
            if(max < arr[i] && arr[i] < 500){
                max = arr[i];
            }

            if(obaeak > arr[i] && arr[i] > 500){
                obaeak = arr[i];
            }
        }
        System.out.print(max + " " + obaeak);
    }
    
}