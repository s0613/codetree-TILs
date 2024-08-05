import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = reverse(str);
        if(str.equals(str2)){
            System.out.print("Yes");
        }
        else System.out.print("No");
    }
    public static String reverse(String str){
        String str2 = "";
        for(int i = str.length()-1; i >= 0; i--){
            str2 += str.charAt(i);
        }
        return str2;
    }
}