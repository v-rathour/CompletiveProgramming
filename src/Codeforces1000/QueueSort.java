package Codeforces1000;

import java.util.Scanner;

public class QueueSort {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        long []nums = new long[n];

        long min = Long.MAX_VALUE;
        int indx = -1;
        for(int i = 0;i<n;i++){
            nums[i] = obj.nextLong();
            if(min > nums[i]){
                min = nums[i];
                indx = i;
            }
        }

        for (int i = indx+1; i <n ; i++) {
            if(nums[i-1] > nums[i]){
                System.out.println("-1");
                return;
            }
        }

        System.out.println(indx);

    }


}
