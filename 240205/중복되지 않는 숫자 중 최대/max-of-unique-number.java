import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int tempM = 0;
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            if(max < temp){
                tempM = max;
                max = temp;
            }else if(max == temp){
                max = tempM;
            }else if(tempM < temp){
                tempM = temp;
            }
        }
        System.out.print(max);
    }
}