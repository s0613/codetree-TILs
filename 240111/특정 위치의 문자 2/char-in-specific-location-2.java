import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[10];
        for(int i = 0; i < 10; i++){
            char temp = sc.next().charAt(0);
            arr[i] = temp;
        }
        System.out.print(arr[1] + " " + arr[4] + " " +arr[7]);
    }
}