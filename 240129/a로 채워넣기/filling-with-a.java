import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        arr[1] = 'a';
        arr[arr.length-2] = 'a';
        str = String.valueOf(arr);
        System.out.print(str);
    }
}