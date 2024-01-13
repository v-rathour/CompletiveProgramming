package Codeforces;

import java.util.Scanner;

public class LuckyNumbers {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int left = obj.nextInt();
        int right = obj.nextInt();
        int ans = -1;
        int diff = -1;
        left = Math.max( left,right-100);
        while(left <= right){
            int copy = left;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            while(copy != 0){
                int rem = copy%10;
                max = Math.max(max,rem);
                min = Math.min(min,rem);
                copy /= 10;
            }

            if(diff <= (max - min)){
                diff = (max-min);
                ans = left;
            }

            left ++;


        }

        System.out.println(ans);
    }

}
