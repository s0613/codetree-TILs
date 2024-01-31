import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'e'){
                str = str.substring(0,i) + str.substring(i+1,str.length());
                break;
            }
        }
        System.out.print(str);
    }
}