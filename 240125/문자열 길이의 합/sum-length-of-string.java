import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int aCnt = 0;
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
            sum += str[i].length();
            if(str[i].charAt(0) == 'a'){
                aCnt++;
            }
        }
        System.out.print(sum + " " + aCnt);
    }
}