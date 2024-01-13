package Codeforces1000;

import java.util.Scanner;

public class ArrayEversion {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        long []arr = new long[n];
        for (int i = 0; i < n; i++) {
              arr[i] = obj.nextInt();
        }
        long maxele = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            maxele = Math.max(maxele,arr[i]);
        }

        long max = arr[n-1];
        int i = n-1;
        int ans = 0;
        while(i>=0){
            if(max<arr[i]){
                max = arr[i];
                ans++;
            }

            if(max == maxele){
                break;
            }
            i--;
        }

        System.out.println(ans);

    }
}
