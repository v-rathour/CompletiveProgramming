package Codeforces;

import java.util.Scanner;

public class Exponential_Equation {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solve(obj);
        }
    }
    public static void solve(Scanner obj){

        long n = obj.nextInt();

        if(n%2 != 0){
            System.out.println(-1);
            return;
        }

        long x = 1;
        long y = n/2;

        System.out.println(x+" "+y);

    }
}
