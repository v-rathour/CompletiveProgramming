package Codeforces1000;

import java.util.Arrays;
import java.util.Scanner;

public class Can_I_Square {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        int n = obj.nextInt();
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += obj.nextLong();
        }

        int sq = (int)Math.sqrt(sum);

        if((long) sq *sq == sum){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
