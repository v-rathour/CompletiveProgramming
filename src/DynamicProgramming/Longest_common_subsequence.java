package DynamicProgramming;

public class Longest_common_subsequence {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        int [][]dp = new int[s1.length()][s2.length()];
        System.out.println(LCS(s1,s2,0,0,dp));
    }

    public static int LCS(String s1,String s2,int i, int j,int [][]dp){

        if(s1.length() == i || s2.length() == j){
            return 0;
        }

        if(dp[i][j] != 0){
            return dp[i][j];
        }

        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans= 1+LCS(s1,s2,i+1,j+1,dp);
        }else{
            int fs = LCS(s1,s2,i+1,j,dp);
            int ss = LCS(s1,s2,i,j+1,dp);
            ans = Math.max(fs,ss);
        }
        return dp[i][j] = ans;
    }
}
