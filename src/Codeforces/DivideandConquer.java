package Codeforces;

import java.util.Scanner;

public class DivideandConquer {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int []arr = new int[n];
        int sum = 0;

         for(int i = 0;i<n;i++)
        {
            int num = obj.nextInt();
            arr[i] = num;
            sum += arr[i];
        }

         if(sum%2 == 0){
             System.out.println("0");
             return;
         }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int temp = 0;
            while(num %2 == (num/2)%2){
                temp++;
                num /= 2;
            }
            ans = Math.min(ans,temp+1);
        }

        System.out.println(ans);


    }
}
