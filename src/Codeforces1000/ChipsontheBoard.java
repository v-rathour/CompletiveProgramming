package Codeforces1000;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ChipsontheBoard {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        long t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){
        int n = obj.nextInt();

        long []a = new long[n];
        long []b = new long[n];
        long min1 = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = obj.nextLong();
            min1 = Math.min(min1,a[i]);
        }
        long sum1 = 0;
        long min2 = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            b[i] = obj.nextLong();
            sum1 += (min1+b[i]);
            min2 = Math.min(min2,b[i]);
        }

        long sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2 += (min2+a[i]);
        }

        System.out.println(Math.min(sum1,sum2));
    }

}
