import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < q; i++){
            int num = sc.nextInt();
            if(num == 1){
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            }else if(num == 2){
                int a = sc.nextInt();
                for(int j = 0; j < n; j++){
                    if(arr[j] == a){
                        System.out.println(j+1);
                        break;
                    }else if(j == n-1){
                        System.out.println(0);
                    }
                }
            }else{
                int a = sc.nextInt();
                int b = sc.nextInt();
                for(int j = a; j <= b; j++){
                    System.out.print(arr[j-1] + " ");
                }
                System.out.println();
            }
        }
    }
}