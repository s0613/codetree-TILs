import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int cnt = 1;
        for(int i = n-1; i >= 0; i--){
            int row = n-1;
            int row2 = 0;
            while(true){
                if(i % 2 == 1){
                    arr[row][i] = cnt;
                    cnt++;
                    row--;
                }
                else{
                    arr[row2][i] = cnt;
                    cnt++;
                    row2++;
                }
                if(row < 0 || row2 > n-1){
                    break;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}