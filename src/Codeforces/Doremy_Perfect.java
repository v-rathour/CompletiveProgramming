package Codeforces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Doremy_Perfect {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solve(obj);
        }
    }

    public static void solve(Scanner obj){
        int n = obj.nextInt();
        int max = 0;
        int last = 0;
        for (int i = 0; i < n; i++) {
            int num = obj.nextInt();
            if(i == 0){
                last = num;
            }
            max = Math.max(max,num);
            last = findGCD(last,num);
        }
        System.out.println(max/last);

    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

}
