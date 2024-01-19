import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = 32;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 3; j++){
                char a = sc.next().charAt(0);
                int k = (int)a - b;
                System.out.print((char)k + " ");
            }
            System.out.println();
        }
    }
}