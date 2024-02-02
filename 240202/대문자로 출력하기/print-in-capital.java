import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if((int)arr[i] >= 65 && (int)arr[i] <= 122){
                if((int)arr[i] >= 97){
                    System.out.print((char)((int)arr[i]-32));
                }else{
                    System.out.print(arr[i]);
                }
            }
        }
        System.out.printf("%d",(int)'[');
    }
}