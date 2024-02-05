import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int num = 0;
        int[] arr5 = new int[1000];
        int[] arr3 = new int[2000];
        int cnt = 0;
        boolean boo = false;
            if(n/5 > 0){
                for(int i = 0; i < n/5; i++){
                    arr5[i] = 1;
                    cnt++;
                }
            }
            n %= 5;
            while(true){
            if(n%3 != 0){
                arr5[--cnt] = 0;
                n += 5;
            }else{
                for(int i = 0; i < n/3; i++){
                    arr3[i] = 1;
                }
                break;
            }
            if(n == temp){
                boo = true;
                break;
            }
            }
        
        if(boo){
            System.out.print(-1);
        }else{
            for(int i = 0; i < 1000; i++){
                if(arr5[i] == 1){
                    num++;
                }
            }
            for(int i = 0; i < 2000; i++){
                if(arr3[i] == 1){
                    num++;
                }
            }
            System.out.print(num);
        }
    }
}