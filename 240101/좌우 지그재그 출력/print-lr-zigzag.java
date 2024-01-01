import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 1;
        int even = 0;
        int tempOdd = 0;
        int tempEven = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                odd = tempEven;
                for(int k = 0; k < n; k++){
                    odd++;
                    System.out.printf("%d ",odd);
                }
                tempOdd = odd;
            }
            else{
                even = tempOdd + n;
                tempEven = even;
                for(int k = 0; k < n; k++){
                    System.out.printf("%d ",even);
                    even--;
                }
            }
        
            System.out.println();
             
        
        }
    }
}