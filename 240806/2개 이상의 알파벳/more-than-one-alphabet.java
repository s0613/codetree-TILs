import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(testStr(str)){
            System.out.print("Yes");
        }
        else System.out.print("No");
        
    }
    public static boolean testStr(String str){
        char a = str.charAt(0);
        for(int i = 1; i < str.length(); i++){
            if(a != str.charAt(i)){
                return true;
            }
        }
        return false;
        
    }
}