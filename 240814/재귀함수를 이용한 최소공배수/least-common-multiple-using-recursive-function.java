import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 1;
        
        int num = infact(sum,arr);
        System.out.print(num);
    }
    public static int infact(int sum, int[] arr){
        for(int i = 0; i < arr.length; i++){
            if(sum % arr[i] != 0){
                return infact(sum+1, arr);
            }
        }
        return sum;
    }
        
    }