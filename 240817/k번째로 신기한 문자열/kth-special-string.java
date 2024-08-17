import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        String t = sc.nextLine().trim();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLine();
        }
        int start = 0;
        int end = n;
        Arrays.sort(arr);
        for(int i = 0; i < n; i++){
            if(arr[i].substring(0,t.length()).equals(t)){
                start = i;
                
                break;
            }
        }
        
        for(int i = start; i < n; i++){
            if(!arr[i].substring(0,t.length()).equals(t)){
                end = i;
                
                break;
            }
        }
        String[] str = new String[end-start+1];
        for(int i = 0; i < end-start+1; i++){
            str[i] = arr[start + i];
        }
        System.out.print(str[k-1]);
    }
}