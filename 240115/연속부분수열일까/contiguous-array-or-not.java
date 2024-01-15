import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i = 0; i < n1; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        int cnt = 0;
        int cnt2 = 0;
        boolean damn = true;
        while(damn){
            if(cnt >= n1 || cnt2 >= n2){
                System.out.print("No");
                break;
            }
            if(arr1[cnt] == arr2[cnt2]){
                if(n1 > n2){
                    int cnt3 = 0;
                    for(int i = 0; i < n2; i++){
                        if(arr1[cnt+i] == arr2[i]){
                            cnt3++;
                        }
                    }
                    if(cnt3 == n2){
                        System.out.print("Yes");
                        break;
                    }
                    else{
                        if(n2 < n1 - cnt - cnt3){
                            cnt = cnt3+1;
                            continue;
                        }else{
                            System.out.print("No");
                            break;
                        }

                    }
                }
                else{
                    int cnt3 = 0;
                    for(int i = 0; i < n2; i++){
                        if(arr1[i] == arr2[cnt2+i]){
                            cnt3++;
                        }
                    }
                    if(cnt3 == n1){
                        System.out.print("Yes");
                        break;
                    }
                    else {
                        if(n1 < n2 - cnt - cnt3){
                            cnt2 = cnt3+1;
                            continue;
                        }
                        System.out.print("No");
                        break;
                    }
                }
            }else{
                if(n1 > n2){
                    cnt++;
                }else cnt2++;
            }

        }
    }
}