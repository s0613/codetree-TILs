import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        int M = sc.nextInt();
        int N = sc.nextInt();
        testInput(Y, M, N);
    }
    public static void testInput(int y,int m, int n){
        int num = 0;
        if(y % 4 == 0 && y % 100 == 0 && y % 400 == 0){
            num = 29;
        }else if(y% 4 == 0 && y% 100 == 0){
            num = 28;
        }else if(y % 4 == 0){
            num = 29;
        }else num = 28;

        if(m == 2){
            if(n > num){
                System.out.print("-1");
            }else System.out.print("Winter");
        }else{
            if(m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
                if(n > 31){
                    System.out.print("-1");
                    return;
                }else {
                    if(m ==3 || m == 5){
                        System.out.print("Spring");
                    }else if(m == 7 || m == 8){
                        System.out.print("Summer");
                    }
                    else if(m == 10){
                        System.out.print("Fall");
                    }
                    else System.out.print("Winter");
                
                return;}
            }
            else if(m <13){
                if(n > 30){
                    System.out.print("-1");
                    return;
                }else {
                    if(m == 4){
                        System.out.print("Spring");
                    }
                    else if(m == 6){
                        System.out.print("Summer");
                    }
                    else if(m == 9 || m == 11){
                        System.out.print("Fall");
                    }
                    return;}
            }else System.out.print("-1");
        }
    }
}