import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int num = sc.nextInt();
            if(num == 1){
                str = str.substring(1,str.length()) + str.charAt(0);
                System.out.println(str);
            }else if(num == 2){
                str = str.charAt(str.length()-1) + str.substring(0,str.length()-1);
                System.out.println(str);
            }else{
                char[] arr = str.toCharArray();
                char[] arr2 = new char[str.length()];
                int n = 0;
                for(int j = str.length()-1; j >= 0; j--){
                    arr2[n] = arr[j];
                    n++;
                }
                str = String.valueOf(arr2);
                System.out.println(str);
            }
        }
    }
}