package DynamicProgramming;

public class MCM {
    public static void main(String[] args) {
        int []arr = {4,2,3,5,1};
        System.out.println(mcm(arr,0,arr.length-1));
    }

    public static int mcm(int[] arr,int i,int j){
        if(i+1 == j){
            return 0;
        }

        int ans = Integer.MAX_VALUE;
        for (int k = i+1; k < j; k++) {
            int fs = mcm(arr,i,k);  // dp[i][k]
            int ss = mcm(arr,k,j);   // dp[k][j]
            int self = arr[i]*arr[j]*arr[k];
            ans = Math.min(ans,fs+ss+self);
        }

        return ans;
    }

//    pepcoding solution
    public static int mcm(int []arr){

        int n = arr.length;
        int [][]dp = new int[n-1][n-1];

        for (int g = 0; g < dp.length; g++) {
            for (int i = 0,j = g; i <dp.length ; i++,j++) {
                if(g == 0){
                    dp[i][j] = 0;
                }
                else if(g == 1){
                    dp[i][j] = arr[i]*arr[j]+arr[j+1];
                }
                else{
                    int min = Integer.MAX_VALUE;
                    for (int k = i; k <j ; k++) {
                        int lc = dp[i][k];
                        int rc = dp[k+1][j];
                        int mc = arr[i]*arr[k+1]*arr[j+1];

                        int tc = lc+rc+mc;
                        if(tc<min){
                            min = tc;
                        }
                    }

                    dp[i][j] = min;
                }
            }
        }

        return dp[0][dp.length-1];

    }

}
