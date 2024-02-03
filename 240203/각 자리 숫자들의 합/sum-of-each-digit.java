import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i < a.length(); i++){
            String temp = "";
            temp += a.charAt(i);
            sum += Integer.parseInt(temp);
        }
        System.out.print(sum);
    }
}