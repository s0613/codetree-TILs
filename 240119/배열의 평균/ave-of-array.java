import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[][] arr = new float[2][4];
        float allSum = 0;
        for(int i = 0; i < 2; i++){
            float sum = 0;
            for(int j = 0; j < 4; j++){
                arr[i][j] = sc.nextFloat();
                sum += arr[i][j];
                allSum += arr[i][j];
            }
            System.out.print(sum/4 + " ");
        }
        System.out.println();

        for(int i = 0; i < 4; i++){
            float sum = 0;
            for(int j = 0; j < 2; j++){
                sum += arr[j][i];
            }
            System.out.print(sum/2 + " ");
        }
        System.out.println();
        System.out.print(allSum/8);
    }
}