import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        double mean = 0;
        int sum = 0;
        for(int i = 0; i < 10; i++){
            int temp = sc.nextInt();
            arr[i] = temp;
            if(i % 2 == 1){
                sum += temp;
            }

            if(i % 3 == 2){
                mean += temp;
            }
        }

        System.out.printf("%d %.1f",sum,mean/3);
        
    }
}