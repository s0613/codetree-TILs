import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNN(n);
    }
    public static void printNN(int n){
        int k = 1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(k + " ");
                k++;
                if(k == 10){
                    k = 1;
                }
            }
            System.out.println();
        }
    }
}