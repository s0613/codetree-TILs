import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int q = sc.nextInt();
        char[] arr = s.toCharArray();
        for(int i = 0; i < q; i++){
            int temp = sc.nextInt();
            if(temp == 1){
               int a = sc.nextInt();
               int b = sc.nextInt();
               char temp2 = arr[a-1];
               arr[a-1] = arr[b-1];
               arr[b-1] = temp2;
               for(int j = 0; j < arr.length; j++){
                System.out.print(arr[j]);
               }
               System.out.println();
            }
            else{
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                for(int j = 0; j < arr.length; j++){
                    if(arr[j] == a){
                        arr[j] = b;
                    }
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
        }
    }
}