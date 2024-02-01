import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int b = (int)a;
        if(a == 'a'){
            System.out.print("z");
        }else{
            System.out.print((char)(b-1));
        }
    }
}