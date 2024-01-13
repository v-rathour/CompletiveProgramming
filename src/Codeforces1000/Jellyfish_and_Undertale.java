package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class Jellyfish_and_Undertale {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long a = obj.nextLong();
        long b = obj.nextLong();
        int n = obj.nextInt();

        long []nums = new long[n];

        for (int i = 0; i <n ; i++) {
            nums[i] = obj.nextInt();
        }

        Arrays.sort(nums);

        long c = b;
        int i = 0;
        long ans = c-1;
        c = 1;

        while(i<n){
            c = Math.min(a,c+nums[i]);
            if(i != n-1){
                ans += (c-1);
                c = 1;
            }
            else{
                ans += c;
                c = 0;
            }
            i++;
        }

        System.out.println(ans);
    }
}
