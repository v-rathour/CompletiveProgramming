package Codeforces1000;

import java.util.Scanner;

public class AlsoTryMinecraft {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        long []left = new long[n];
        long []right = new long[n];

        for (int i = 1; i < n; i++) {
            if(arr[i-1]>=arr[i]){
                left[i] = left[i-1]+(arr[i-1]-arr[i]);
            }
            else{
                left[i] = left[i-1];
            }
        }

        for(int i = n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                right[i] = right[i+1]+(arr[i+1]-arr[i]);
            }
            else{
                right[i] = right[i+1];
            }
        }

        while(m-->0){
            int s = obj.nextInt();
            int t = obj.nextInt();

            s--;
            t--;
            if(s<t){
                System.out.println(left[t]-left[s]);
            }else if(s>t){
                System.out.println(right[t]-right[s]);
            }
            else{
                System.out.println("0");
            }
        }
    }

}
