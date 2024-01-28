package Codeforces;

import java.util.Scanner;

public class Phoenix_and_Puzzle {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){
        long n = obj.nextLong();

        if(n%2 != 0){
            System.out.println("NO");
            return;
        }

        long z = n/2;
        if(isPerfectSquare(z)){
            System.out.println("YES");
            return;
        }

        if(n%4 != 0){
            System.out.println("NO");
            return;
        }

        z = n/4;
        if(isPerfectSquare(z)){
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
    }

    private static boolean isPerfectSquare(long num) {
        if (num < 0) {
            return false; // Negative numbers are not perfect squares
        }

        long sqrt = (long) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

}
