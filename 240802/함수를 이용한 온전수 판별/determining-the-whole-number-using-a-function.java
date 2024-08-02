import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a; i <= b; i++){
            if(printA(i)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    public static boolean printA(int a){
        if(a % 2 == 0){
        
            return false;
        }
        else if(a%10 == 5){
            return false;
        }
        else if(a%3 == 0 && a%9 != 0){
            return false;
        }
        return true;
    }
}