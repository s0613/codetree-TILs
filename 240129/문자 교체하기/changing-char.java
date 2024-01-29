import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = sc.next();
        char[] arr = str.toCharArray();
        char[] arr2 = str2.toCharArray();
        arr2[0] = arr[0];
        arr2[1] = arr[1];
        str2 = String.valueOf(arr2);
        System.out.print(str2);
    }
}