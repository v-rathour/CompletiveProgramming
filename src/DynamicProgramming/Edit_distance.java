package DynamicProgramming;

import java.util.Arrays;

public class Edit_distance {

    public static void main(String[] args) {
        String s1 = "FOOD";
        String s2 = "MONEY";
        int [][]dp = new int[s2.length()][s2.length()];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }

        System.out.println(Editdistance(s1,s2,0,0,dp));
    }

    public static int Editdistance(String s1,String s2,int i ,int j,int[][]dp){

        if(i == s1.length() ){
            return s2.length()-j;
        }

        if( j == s2.length()){
            return s1.length()-i;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans =  Editdistance(s1,s2,i+1,j+1,dp);
        }
        else{
            int d = Editdistance(s1,s2,i+1,j,dp);
            int in = Editdistance(s1,s2,i,j+1,dp);
            int rp = Editdistance(s1,s2,i+1,j+1,dp);

            ans = Math.min(d,Math.min(in,rp))+1;
        }

        return dp[i][j] = ans;

    }

}
