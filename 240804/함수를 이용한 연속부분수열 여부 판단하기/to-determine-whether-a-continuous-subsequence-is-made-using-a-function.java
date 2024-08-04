import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nn = sc.nextInt();
        int[] n1 = new int[n];
        int[] n2 = new int[nn];
        n1 = inputarray(n, n1, sc);
        n2 = inputarray(nn, n2, sc);
        inputTest(n1, n2);
    }
    public static int[] inputarray(int n, int[] n1,Scanner sc){
        for(int i = 0; i < n; i++){
            n1[i] = sc.nextInt();
        }
        return n1;
    }
    public static void inputTest(int[] n1, int[] n2){
        int n = n1.length;
        int nn = n2.length;
        int nSize = n1.length > n2.length ? n1.length : n2.length;
        int cnt = 0;
        int n2Size = n1.length > n2.length ? n2.length : n1.length;
        for(int i = 0; i < nSize-n2Size+1; i++){
            cnt = 0;
            for(int j = 0; j < n2Size; j++){
                if(n1[i + j] == n2[j]){
                    cnt++;
                }else break;
            }
            if(cnt == n2Size){
                    System.out.print("Yes");
                    return;
                }
        }
        System.out.print("No");
    }
}