import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int cnt = n;
            for(int j = 0; j < n; j++){
                if(i % 2 == 0){
                    cnt = j;
                    System.out.printf("%d",++cnt);
                }
                else{
                    System.out.printf("%d",cnt--);
                }
            }
            System.out.println();
        }
    }
}