package DynamicProgramming;

public class LongestIncreaseSubsequence {
    public static void main(String[] args) {
        int []arr =  {0,8,4,2,12,10,6,14,1,9,5,13,3,11,7,15};
        System.out.println(lis(arr));
    }

    public static int lis(int[] arr){
        int []dp = new int[arr.length];
        dp[0] = arr[0];
        int len = 1;
        for (int i = 0; i < dp.length; i++) {
            if(dp[len-1]<arr[i]){
                dp[len] = arr[i];
                len++;
            }
            else{
                int idx = BinarySearch(dp,0,len-1,arr[i]);
                dp[idx] = arr[i];
            }
        }
        return len;
    }

    public static int  BinarySearch(int []dp,int si,int ei,int item){

        int idx = 0;
        while(si<=ei){

            int mid = si+(ei-si)/2;

            if(dp[mid] > item){
                idx = mid;
                ei = mid -1;
            }
            else{
                si = mid+1;
            }


        }

        return idx;

    }
}
