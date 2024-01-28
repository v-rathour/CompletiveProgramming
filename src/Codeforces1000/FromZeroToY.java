package Codeforces1000;

import java.util.Scanner;

public class FromZeroToY {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();

        while(t-->0){
            solution(obj);
        }
    }

    public static void solution(Scanner obj){

        long x = obj.nextLong();
        long y = obj.nextLong();

        if(x>y){
            System.out.println(y);
            return;
        }

        long rem = y%x;
        long q = y/x;
        long ans = 0;
        while(q != 0){
            long digit = q%10;
            ans += digit;
            q /=10;
        }

        ans += rem;
        System.out.println(ans);

    }
}
