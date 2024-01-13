package DynamicProgramming;

public class PridictWinner {

    public static void main(String[] args) {
        int []nums = {1,5,2};

        System.out.println(Optimal_Game_Strategy(nums,0,nums.length-1,1,0,0));
    }

    public static boolean Optimal_Game_Strategy(int[] arr, int i, int j,int year,int first ,int second) {
        if (i > j) {
            if(first>=second){
                System.out.println(first+" "+second);
                return true;
            }
            return false;
        }

        if(year%2 != 0){
            if(Optimal_Game_Strategy(arr,i+1,j,year+1,first+arr[i],second)){
                return true;
            }
            if(Optimal_Game_Strategy(arr,i,j-1,year+1,first+arr[j],second)){
                return true;
            }
        }
        else{
            if(Optimal_Game_Strategy(arr,i+1,j,year+1,first,second+arr[i])){
                return true;
            }

            if(Optimal_Game_Strategy(arr,i,j-1,year+1,first,second+arr[j])){
                return true;
            }
        }

        return false;
    }

}
