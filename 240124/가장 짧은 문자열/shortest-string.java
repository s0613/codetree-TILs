import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int[] d = new int[3];
        d[0] = a.length();
        d[1] = b.length();
        d[2] = c.length();
        int max = -1;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++){
            if(max < d[i]){
                max = d[i];
            }
            if(min > d[i]){
                min = d[i];
            }
        }
        System.out.print(max - min);
    }
}