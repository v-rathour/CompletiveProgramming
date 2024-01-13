package Codeforces1000;

import java.util.Scanner;

public class Double_ended {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){
        String a = obj.next();
        String b = obj.next();

        int ans = LongestCommonSubstr(a,b);
        ans *= 2;
        int total = a.length()+b.length();
        System.out.println(total-ans);
    }

    public static int LongestCommonSubstr(String X, String Y) {

        int m=X.length();
        int n=Y.length();
        int dp[][] = new  int[m+1][n+1];

        // initialization
        for(int i=0;i<=m;i++)
            dp[i][0]=0;   // Eg LCS of "abc" & "" = 0
        for(int j=0;j<=n;j++)
            dp[0][j]=0;   // Eg LCS of "" & "abc" = 0

        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(X.charAt(i-1)==Y.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j]=0;                   // ONLY THIS CHANGE
            }
        }
        int maxLen=0;              // Now finding the max element
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=n;j++)
                maxLen=Math.max(maxLen,dp[i][j]);
        }
        return maxLen;
    }
}
