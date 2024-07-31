import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for(int i = a; i <= b; i++){
            sum += decimal(i);
        }
        System.out.print(sum);
    }
    public static int decimal(int a){
        int n = 0;
        for(int i = 1; i <= a; i++){
            if(a%i == 0){
                n++;
            }
            if(n >= 3){
                return 0;
            }
        }
        return a;
    }
}