import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        char[] a = new char[b.length()];

        for(int i = 0; i < b.length(); i++){
            a[i] = b.charAt(i);
        }
        int cnt = 0;
        String k = "";
        while(true){
            char c = a[cnt];
            int cnt2 = 0;
            for(int i = cnt; i < b.length(); i++){
                if(a[i] == c){
                    cnt++;
                    cnt2++;
                }
                if(a[i] != c){
                    break;
                }
            }
            k = k + c + cnt2;
            if(cnt >= b.length()){
                break;
            }
        }
        System.out.println(k.length());
        System.out.println(k);

    }
}