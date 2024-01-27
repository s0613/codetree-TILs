import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int cnt = 0;
        int cnt2 = 0;
        for(int i = 0; i < a.length()-1; i++){
            if(a.charAt(i) == 'e' && a.charAt(i+1) == 'e'){
                cnt++;
            }
            if(a.charAt(i) == 'e' && a.charAt(i+1) == 'b'){
                cnt2++;
            }
        }
        System.out.print(cnt + " " + cnt2);
    }
}