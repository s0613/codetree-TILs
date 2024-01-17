import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxVal1 = Integer.MIN_VALUE;
        int maxVal2 = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            if(maxVal1 < temp){
                maxVal1 = temp;
            }
            else if(maxVal2 < temp){
                maxVal2 = temp;
            }
        }
        System.out.print(maxVal1 + " " + maxVal2);
    }
}