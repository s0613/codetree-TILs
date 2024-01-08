import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double cnt = 0;
        double sum = 0;
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextDouble();
        }
        for(int i = 0; i < 10; i++){
            if(arr[i] >= 250) break;
            else{
                cnt++;
                sum += arr[i];
            }
        }
        System.out.printf("%d %.1f",(int)sum,sum/cnt);
    }
}