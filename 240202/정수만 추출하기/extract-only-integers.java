import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int cnt = 0;
        int sum = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) >= '0' && a.charAt(i) <= '9'){
                cnt++;
            }else{
                break;
            }
        }
        a = a.substring(0,cnt);
        cnt = 0;
        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) >= '0' && b.charAt(i) <= '9'){
                cnt++;
            }else{
                break;
            }
        }
        b = b.substring(0,cnt);
        sum += Integer.parseInt(a);
        sum += Integer.parseInt(b);
        System.out.print(sum);
    }
}