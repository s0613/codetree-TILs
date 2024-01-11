import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i < 10; i++){
            int temp = sc.nextInt();
            if(i%2 == 0){
                oddSum += temp;
            }else evenSum += temp;
        }

        if(oddSum > evenSum){
            System.out.print(oddSum - evenSum);
        }else System.out.print(evenSum - oddSum);
    }
}