import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i < 20; i++){
            for(int j = 1; j < 20; j++){
                System.out.printf("%d * %d = %d",i,j,i*j);
                if(j % 2 == 1 && j != 19) System.out.print(" / ");
                if(j % 2 == 0 || j == 19) System.out.println();
            }
        }
    }
}