import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '1' && str.charAt(i) <= '9'){
                sum += (int)str.charAt(i) - 48;
            }
        }
        System.out.print(sum);
    }
}