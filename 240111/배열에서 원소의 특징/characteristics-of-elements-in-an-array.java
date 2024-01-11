import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = 0;
        for(int i = 0; i < 9; i++){
            int temp2 = sc.nextInt();
            if(temp2 % 3 == 0){
                System.out.print(temp);
                break;
            }
            temp = temp2;
        }
    }
}