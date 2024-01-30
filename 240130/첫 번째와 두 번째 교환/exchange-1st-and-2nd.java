import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = str.charAt(0);
        char b = str.charAt(1);
        char[] arr = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(arr[i] == a){
                arr[i] = b;
            }
            else if(arr[i] == b){
                arr[i] = a;
            }
        }
        str = String.valueOf(arr);
        System.out.print(str);    
    }
}