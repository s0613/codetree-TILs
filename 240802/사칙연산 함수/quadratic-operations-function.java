import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);
        int c = sc.nextInt();
        int n = 0;
        if(b == '+'){
            n = a+c;
        }
        else if(b == '-'){
            n = a-c;
        }
        else if(b == '/'){
            n = a/c;
        }
        else if(b == '*'){
            n = a*c;
        }
        else {System.out.print("False"); return;}
        System.out.print(a + " " + b + " " + c + " " + "=" + " " + n);
    }
}