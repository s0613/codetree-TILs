import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++){
            arr[i] = sc.nextInt();
        }
        Integer[] it = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(it, Collections.reverseOrder());
        System.out.print(it[k-1]);
    }
}