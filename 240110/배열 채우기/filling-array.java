import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = 0;
        int a = sc.nextInt();
        while(a != 0){
            arr[cnt] = a;
            cnt++;
            a = sc.nextInt();
            if(cnt == 10) a = 0;
        }
        for(int i = cnt - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}