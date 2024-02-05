import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int tempM = Integer.MIN_VALUE;
        int num = 0;
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            if(max < temp){
                max = temp;
            }else if(max == temp){
                max = tempM;
                num++;
                if(num == n/2){
                    max = -1;
                    break;
                }
            }else if(tempM < temp){
                tempM = temp;
            }
        }
        System.out.print(max);
    }
}