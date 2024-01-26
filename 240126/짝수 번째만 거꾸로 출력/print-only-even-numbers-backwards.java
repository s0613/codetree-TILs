import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if(str.length()%2 == 0){
            for(int i = 0; i < str.length(); i++){
            if(i % 2 == 0){
                System.out.print(str.charAt(str.length()-1-i));
            }
        }
        }else {
            for(int i = 1; i <= str.length(); i++){
            if(i % 2 == 0){
                System.out.print(str.charAt(str.length()-i));
            }
        }
        }
        
    }
}