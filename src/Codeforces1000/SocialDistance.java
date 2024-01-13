package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class SocialDistance {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        long k = obj.nextInt();
        long []arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextLong();
        }

        if(n>k){
            System.out.println("NO");
            return;
        }

        Arrays.sort(arr);
        long count = 2*arr[0]+1;

        for (int i = 1; i <n ; i++) {

            if(i == n-1){
                count += arr[i]-arr[i-1];
                count++;
                count += arr[i]-arr[0];
            }
            else{
                count += arr[i]-arr[i-1];
                count++;
                count += arr[i];
            }

        }

        if(count<=k){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
