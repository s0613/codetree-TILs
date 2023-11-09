import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        for(int i = 0; i < 10; i++){
            String a = sc.nextLine();
            arr[i] = a;
        }
        char e = sc.next().charAt(0);
        int cnt = 0;
        String[] arr2 = new String[10];
        for(int i = 0; i < 10; i++){
            if((char)arr[i].charAt(arr[i].length()-1) == e){
                arr2[cnt] = arr[i];
                cnt++;
            }
        }

        for(int i = 0; i < cnt; i++){
            System.out.println(arr2[i]);
        }

        if(cnt == 0){
            System.out.print("None");
        }
        
    }
}