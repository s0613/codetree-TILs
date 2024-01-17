import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int min = Integer.MAX_VALUE;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            if(min > temp){
                min = temp;
                cnt = 0;
            }
            if(min == temp){
                cnt++;
            }
        }
        System.out.print(min + " " + cnt);
    }
}