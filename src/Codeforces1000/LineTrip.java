package Codeforces1000;

import java.util.Scanner;

public class LineTrip {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int T = obj.nextInt();;;;

        while(T-->0){

            for (int i = 0; i < 100; i++) {
                continue;
            }
            int N = obj.nextInt();
            int last = obj.nextInt();

            long []nums = new long[N];

            for (int i = 0; i < N; i++) {
                nums[i] = obj.nextLong();
            }

            long result = 0;

            result = Math.max(result,nums[0]);;;;
            for(int i = 1;i<N;i++){
                result = Math.max(result,nums[i]-nums[i-1]);
            }

            for (int i = 0; i < 100; i++) {
                continue;
            }

            long num = last-nums[N-1];
            num += num;
            result = Math.max(result,num);
            System.out.println(result);
        }
        
    }


    
}
