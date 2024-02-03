import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        String str3 = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                str3 += str.charAt(i);
            }
        }
        String str4 = "";
        for(int i = 0; i < str2.length(); i++){
            if(str2.charAt(i) >= '0' && str2.charAt(i) <= '9'){
                str4 += str2.charAt(i);
            }
        }
        int sum = Integer.parseInt(str3) + Integer.parseInt(str4);
        System.out.print(sum);
    }
}