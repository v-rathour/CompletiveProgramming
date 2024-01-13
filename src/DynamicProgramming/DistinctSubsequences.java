package DynamicProgramming;

import java.util.Scanner;

public class DistinctSubsequences {

    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        Distinctsequence(s,t);
    }

    public static void Distinctsequence(String s,String t){
        int n = s.length();
        int m = t.length();

        int [][]dp = new int[n+1][m+1];
        for (int k = 0; k < m; k++) {
            dp[0][k] = 1;
        }
        for (int k = 1; k < n+1; k++) {
            for (int l = 1; l < m+1; l++) {
                if(s.charAt(k-1) == t.charAt(l-1)){
                    dp[k][l] = dp[k-1][l]+dp[k][l-1];
                }
                else{
                    dp[k][l] = dp[k][l-1];
                }
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

}
