import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(int i = 0; i < 100; i++){
            int temp = sc.nextInt();
            if(temp == 999 || temp == -999){
                break;
            }
            if(maxVal < temp){
                maxVal = temp;
            }
            if(minVal > temp){
                minVal = temp;
            }
        }
        System.out.print(maxVal + " " + minVal);
    }
}