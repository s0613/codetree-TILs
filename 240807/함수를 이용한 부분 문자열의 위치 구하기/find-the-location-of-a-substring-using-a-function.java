import java.util.Scanner;
public class Main {
    public static int n = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        
        testStr(str, str2);
        
        System.out.print(n);
    }
    public static void testStr(String str, String str2){
        for(int i = 0; i < str.length() - str2.length()+1; i++){
            for(int j = 0; j < str2.length(); j++){
                if(str.charAt(i+j) != str2.charAt(j)){
                    break;
                }
                else if(j == str2.length()-1){
                    
                    n = i;
                    return;
                }
            }
        }
        return;
    }
}