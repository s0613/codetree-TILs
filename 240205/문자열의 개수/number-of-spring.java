import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[][] arr = new char[200][200];
        int cnt = 0;
        while(!str.equals("0")){
            cnt++;
            for(int i = 0; i < str.length(); i++){
                arr[cnt-1][i] = str.charAt(i);
            }
            str = sc.nextLine();
        }
        System.out.println(cnt);
        for(int i = 0; i < cnt; i++){
            if(i % 2 == 0){
                for(int j = 0; j < arr[i].length; j++){
                    if(arr[i][j] == ' '){
                        break;
                    }
                System.out.print(arr[i][j]);
            }
                
            }
        }
    }
}