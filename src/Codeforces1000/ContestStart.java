package Codeforces1000;

import java.util.Scanner;

public class ContestStart {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }

    }

    public static void solution(Scanner obj){

        long n = obj.nextInt();
        long x = obj.nextInt();
        long t = obj.nextInt();

        long z = t/x;
        if(z>n){
            System.out.println(((n-1)*n)/2);
        }
        else{
            long ans = z*n;
            ans -= z*(z+1)/2;
            System.out.println(ans);
        }
    }

}
