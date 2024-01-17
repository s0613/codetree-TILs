import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp2 = 0;
        int maxVal1 = Integer.MIN_VALUE;
        int maxVal2 = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            if(maxVal1 < temp){
                temp2 = maxVal1;
                maxVal1 = temp;
                maxVal2 = temp2;
            }
        }
        System.out.print(maxVal1 + " " + maxVal2);
    }
}