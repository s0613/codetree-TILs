import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(printa(i)){
                cnt++;
            }
        }
        System.out.print(cnt);

    }
    public static boolean printa(int a){
        int cnt = 0;
        for(int i = 1; i <= a; i++){
            if(a % i == 0){
                cnt++;
            }
            if(cnt > 2){
                return false;
            }
        }
        if(((a%10) + ((a%100)/10))%2 == 0) return true;
        return false;
    }
}