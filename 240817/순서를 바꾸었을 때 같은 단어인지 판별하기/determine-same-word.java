import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        char[] sChar = new char[str.length()];
        char[] sChar2 = new char[str2.length()];

        for(int i = 0; i < str.length(); i++){
            sChar[i] = str.charAt(i);
        }
        for(int i = 0; i < str2.length(); i++){
            sChar2[i] = str2.charAt(i);
        }

        Arrays.sort(sChar);
        Arrays.sort(sChar2);
        str = String.valueOf(sChar);
        str2 = String.valueOf(sChar2);
        if(str.equals(str2)){
            System.out.print("Yes");
        }
        else System.out.print("No");
    }
}