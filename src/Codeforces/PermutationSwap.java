package Codeforces;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/1828/B
public class PermutationSwap {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){

        int n = obj.nextInt();
        int ans = Integer.MAX_VALUE;
        int flag = 0;
        int pre = 0;
        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();

            if(i >0 && pre <num){
                flag = 1;
            }
            pre = num;
            int rem = Math.abs(num-(i+1));
            if(rem != 0){
                ans = Math.min(ans,rem);
            }
        }

        if(flag == 0){
            System.out.println(1);
            return;
        }

        if(ans == Integer.MAX_VALUE){
            System.out.println("0");
        }
        else{
            System.out.println(ans);
        }
    }

}
