package Codeforces1000;

import java.util.Scanner;

public class HayatoSchool {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        int []arr = new int[n];
        int odd = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
            if(arr[i]%2 != 0){
                odd++;
            }
        }

        if(odd >= 3){
            System.out.println("YES");
            int count = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i]%2 != 0) {
                    System.out.print((i + 1 )+ " ");
                    count++;
                }
                if(count == 3){
                    break;
                }
            }
            System.out.println();
        }
        else if(odd>=1){
            int oddindx = -1;
            int even1 = -1;
            int even2 = -1;
            for (int j = 0; j < n; j++) {
                if(arr[j]%2 != 0){
                    oddindx = j;
                    break;
                }
            }
            for (int j = 0; j < n; j++) {
                if(arr[j]%2 == 0){
                    even1 = j;
                    break;
                }
            }

            for (int j = 0; j < n; j++) {
                if(j != even1 && arr[j]%2 == 0){
                    even2 = j;
                    break;
                }
            }
            if(even1 == -1 || even2 == -1 ){
                System.out.println("NO");
                return;
            }
            System.out.println("YES");
            System.out.println((even1+1)+" "+(even2+1)+" "+(oddindx+1));
        }
        else{
            System.out.println("NO");
        }




    }

}
