import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int num = 0;
        for(int i = a; i <= b; i++){
           num += game369(i);
        }
        System.out.print(num);
    }
    public static int game369(int a){
        if(a % 3 == 0){
            return 1;
        }
        
        String te = Integer.toString(a);
        for(int i = 0; i < te.length(); i++){
            if(te.charAt(i) == '3' || te.charAt(i) == '6' || te.charAt(i) == '9'){
                return 1;
            }
        }
        
        return 0;
    }
}