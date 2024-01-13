package DynamicProgramming;

import java.util.Arrays;

public class MaximumPathsum {
    public static void main(String[] args) {
        int [][]nums = {{1,2,3},{4,5,6}};
        int [][]dp = new int[nums.length][nums[0].length];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
//        int ans = Minmumpath(nums,0,0,dp);
        int ans = MinmumpathOutDp(nums,0,0);
        System.out.println(ans);
    }

    public static int Minmumpath(int [][]nums,int i,int j,int [][]dp){
        if(i >= nums.length || j >= nums[0].length){
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int row = Minmumpath(nums,i+1,j,dp);
        int col = Minmumpath(nums,i,j+1,dp);

        int ans = 0;
        if(i == nums.length-1 || j == nums[0].length-1){
            ans = nums[i][j]+Math.max(row,col);
        }
        else{
            ans = nums[i][j]+Math.min(row,col);
        }
        return dp[i][j] = ans;
    }

    public static int MinmumpathOutDp(int [][]nums,int i,int j){
        if(i >= nums.length || j >= nums[0].length){
            return 0;
        }

        int row = MinmumpathOutDp(nums,i+1,j);
        int col = MinmumpathOutDp(nums,i,j+1);

        int ans = 0;
        if(i == nums.length-1 || j == nums[0].length-1){
            ans = nums[i][j]+Math.max(row,col);
        }
        else{
            ans = nums[i][j]+Math.min(row,col);
        }
        return  ans;
    }
}


