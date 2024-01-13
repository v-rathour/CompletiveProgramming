package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {
        int []arr = {1,2,5};
        int amount = 5;
        int [][]dp = new int[amount+1][arr.length+1];
        for (int i = 0; i < amount+1; i++) {
            for (int j = 0; j < arr.length+1; j++) {
                dp[i][j] = -1;
            }
        }
        coinchange(arr,0,amount,dp);
        System.out.println(coinchange(arr,0,amount,dp)  );
    }


    public static int coinchange(int []arr,int i,int amount,int [][]dp){

        if(amount == 0){
            return 1;
        }

        if(i == arr.length){
            return 0;
        }

        if(dp[amount][i] != -1){
            return dp[amount][i];
        }

        int inc = 0;
        int exc = 0;

        if(amount>=arr[i]){
            inc = coinchange(arr,i,amount-arr[i],dp);
        }
        exc = coinchange(arr,i+1,amount,dp);

        return dp[amount][i] = inc+exc;

    }


}
