import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        int cnt = 0;
        double mean = 0;
        for(int i = 0; i < n; i++){
            if(str[i].charAt(0) == c){
                cnt++;
                mean += str[i].length();
            }
        }

        System.out.printf("%d %.2f",cnt,mean/cnt);
    }
}