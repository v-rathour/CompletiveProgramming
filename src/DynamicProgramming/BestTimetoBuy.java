package DynamicProgramming;

import java.util.PriorityQueue;

public class BestTimetoBuy {

    public static void main(String[] args) {
        int []arr = {2,4,1};
        int k = 2;
        System.out.println(TimetoBuy(arr,k));
    }
    
    public static int TimetoBuy(int []price,int k){
        int []dp = new int[price.length];

        for (int i = 0; i < price.length; i++) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int j = i-1; j >=0  ; j--) {
                if(price[i]>price[j]){
                    if(pq.size()<=k){
                        pq.add(price[i]-price[j]);
                    }
                    else{
                        pq.add(price[i]-price[j]);
                        pq.remove();
                    }
                }
            }
            int sum = 0;
            while(!pq.isEmpty()){
                sum += pq.poll();
            }
            dp[i] = sum;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < dp.length; i++) {
            max = Math.max(max,dp[i]);
        }

        return max;
    }
}
