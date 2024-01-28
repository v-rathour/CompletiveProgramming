package Codeforces1000;

import java.util.Scanner;

public class AddandDivide {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }


    public static void solution(Scanner obj){

        int ans = Integer.MAX_VALUE;
        long a = obj.nextLong();
        long b = obj.nextLong();

        for (int i = 0; i*i <=a; i++) {

            if(b == 1 && i == 0)
                continue;

            int count = i;
            long c = a;

            while(c != 0){
                c /= (b+i);
                count++;
            }

            ans = Math.min(count,ans);
        }

        System.out.println(ans);
    }
}
