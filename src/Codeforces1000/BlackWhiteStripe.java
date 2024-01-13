package Codeforces1000;

import java.util.Scanner;

public class BlackWhiteStripe {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){
        int n = obj.nextInt();
        int k = obj.nextInt();

        String s = obj.next();

        int []left = new int[n+1];
        left[0] = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == 'W'){
                left[i+1] = left[i]+1;
            }
            else{
                left[i+1] = left[i];
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= n-k; i++) {
            ans = Math.min(ans,left[i+k]-left[i]);
        }
        System.out.println(ans);
    }

}
