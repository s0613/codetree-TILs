import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        String c = Integer.toString(sum);
        int cnt = 0;
        for(int i = 0; i < c.length(); i++){
            if(c.charAt(i) == '1'){
                cnt++;
            }
        }
        System.out.print(cnt);

    }
}