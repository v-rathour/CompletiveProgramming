package DynamicProgramming;

import java.util.Arrays;

public class Futture_win_Problem {

    public static void main(String[] args) {

        int []cost = {2,3,5,1,4};
        int [][]dp = new int[cost.length][cost.length];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        System.out.println( WinProblem(cost,0,cost.length-1,1,dp));
        System.out.println(WinProblemBoUp(cost));
    }

    public static int WinProblem(int []cost,int i,int j,int year,int [][]dp){
        if(i>j){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int first = cost[i]*year+WinProblem(cost,i+1,j,year+1,dp);
        int second = cost[j]*year+WinProblem(cost,i,j-1,year+1,dp);

        return dp[i][j] = Math.max(first,second);

    }

    public static int WinProblemBoUp(int []cost){
        int n = cost.length;
        int year = n;
        int [][]dp = new int[n][n];

        for (int i = 0; i < n; i++) {
            dp[i][i] = cost[i]*n;
        }
        year--;
        for (int slide = 1; slide <n ; slide++) {
            for (int j = slide; j < n; j++) {
                int i = j-slide;
                int f = cost[i]*year+dp[i+1][j];
                int s = cost[j]*year+dp[i][j-1];
                dp[i][j] = Math.max(f,s);
            }
            year--;
        }

        return dp[0][n-1];

    }





}
