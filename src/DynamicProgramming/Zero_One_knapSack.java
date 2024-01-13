package DynamicProgramming;

import java.util.Arrays;

public class Zero_One_knapSack {

    public static void main(String[] args) {

        int cap = 8;
        int []wt = {1,4,2,3,6};
        int []val = {1,1,7,9,1};

        int [][] dp = new int[wt.length+1][cap+1];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }

        System.out.println(KnapSack(wt,val,0,cap,dp));

    }

    public static int KnapSack(int []wt,int[] val,int i,int cap,int [][] dp){

        if(cap == 0 || wt.length == i){
            return 0;
        }

        if(dp[i][cap] != -1){
            return dp[i][cap];
        }

        int inc = 0;
        int exc = 0;
        if(cap>=wt[i]){
            inc = val[i]+KnapSack(wt,val,i+1,cap-wt[i],dp);
        }
        exc = KnapSack(wt,val,i+1,cap,dp);

        return dp[i][cap] = Math.max(inc,exc);
    }

}





