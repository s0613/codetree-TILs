import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 10; i++){
            int temp = sc.nextInt();
            if(max < temp){
                max = temp;
            }
        }
        System.out.print(max);
    }
}