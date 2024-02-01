
package Codeforces1000;

import java.util.Scanner;

public class KdivisibleSum {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long n = obj.nextLong();
        long k = obj.nextLong();

        if(n%k == 0){
            System.out.println("1");
            return;
        }

        if(n>k){

            long l = n%k;
            long remain = k-l;
            k = n+remain;
        }
        long temp = k/n;
        long rem = k%n;
        if(rem == 0){
            System.out.println(temp);
        }
        else{
            System.out.println(temp+1);
        }

    }
}
