package Codeforces1000;

import java.util.Scanner;

public class LongestDivisorsInterval {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long n = obj.nextLong();
        long ans = 0;
        long count = 0;
        long start = 1;
        long last = (long)Math.pow(n,0.1);

        while(start<=last){
            while(n%start == 0){
                count ++;
                ans = Math.max(ans,count);
                start++;

            }
            start++;
            count = 0;
        }
        System.out.println(ans);
    }
}
