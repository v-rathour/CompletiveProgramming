package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){
        int n = obj.nextInt();
        int k = obj.nextInt();
        int []nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = obj.nextInt();
        }
        if(n == 1){
            System.out.println("1");
            return;
        }
        Arrays.sort(nums);
        int count = 1;
        int ans= 0;

        for (int i = 1; i <n ; i++) {

            if((nums[i]-nums[i-1])<=k){
                count++;
            }
            else{
                count = 1;
            }
            ans = Math.max(count,ans);
        }
        System.out.println(n-ans);
    }

}
