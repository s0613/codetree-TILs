import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String A = sc.next();
        String B = sc.next();
        while(true){
            if(A.compareTo(B) == 0){
                break;
            }else if(n > A.length()){
                n = 0;
                System.out.print("-1");
                break;
            }
            A = A.charAt(A.length()-1) + A.substring(0,A.length()-1);
            n++;
        }
        if(n != 0){
            System.out.print(n);
        }
    }
}