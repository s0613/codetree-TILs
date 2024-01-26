import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = 0;
        if(str.length()%2 == 0){
            a = 1;
        }else a =2;
        for(int i = a; i < str.length(); i++){
            if(i % 2 == 0){
                System.out.print(str.charAt(str.length()-i));
            }
        }
    }
}