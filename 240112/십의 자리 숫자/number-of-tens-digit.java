import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i = 0; i < 100; i++){
            int temp = sc.nextInt();
            if(temp == 0) break;
            if(temp/10 == 0) continue;
            arr[(temp/10)-1] += 1;
        }
        for(int i = 0; i < 9; i++){
            System.out.println( (i+1) + " - " + arr[i]);
        }
    }
}